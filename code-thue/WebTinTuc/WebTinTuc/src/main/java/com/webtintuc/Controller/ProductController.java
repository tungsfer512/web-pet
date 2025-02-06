package com.webtintuc.Controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.webtintuc.exception.StorageException;
import com.webtintuc.model.Account;
import com.webtintuc.model.BaiViet;
import com.webtintuc.model.Category;
import com.webtintuc.model.ProductDTO;
import com.webtintuc.repo.BaiVietRepository;
import com.webtintuc.repo.CategoryRepository;




@Controller
@RequestMapping("/")
public class ProductController {
	@Autowired
	BaiVietRepository productservice;
	@Autowired
	CategoryRepository categoryService;
	@Autowired
    private HttpSession session;
	@ModelAttribute("categories")
	public List<Category> getCategories(){
		return categoryService.findAll().stream().map(item->{
			Category dtoc=new Category();
			BeanUtils.copyProperties(item, dtoc);
			return dtoc;
		}).collect(Collectors.toList());
	}

	
	@GetMapping("/add")
	public String add(Model model) {
		List<Category> categories=categoryService.findAll();
		model.addAttribute("categories", categories);
		model.addAttribute("baiHoc", new ProductDTO());
		return "/AddEditBlog";
	}
	@GetMapping("/edit/{productId}")
	public String edit(Model model, @PathVariable("productId") Long productId) {
		Optional<BaiViet> opt=productservice.findById(productId);
		ProductDTO dtop=new ProductDTO();
		if(opt.isPresent()) {
			BaiViet p=opt.get();
			BeanUtils.copyProperties(p, dtop);
			dtop.setCategoryId(p.getCategory().getId());

			model.addAttribute("baiHoc", dtop);
			return "/AddEditBlog";
		}
		model.addAttribute("mes", "Product is Empty");
		return "forward: /";
	}
	@PostMapping("/saveOrUpdate")
	public ModelAndView saveorupdate(ModelMap model,
			@Valid @ModelAttribute("product") ProductDTO dto,BindingResult result) throws StorageException {
		if(result.hasErrors()) {
			return new ModelAndView("/AddEditBlog",model);
		}
		BaiViet p=new BaiViet();
		BeanUtils.copyProperties(dto, p);
		Category category=new Category();
		category.setId(dto.getCategoryId());
		p.setCategory(category);
		Account acc=new Account();
		acc.setId((Long) session.getAttribute("accountid"));
		p.setAccount(acc);
		
		
		productservice.save(p);
		model.addAttribute("mes", "Product is saved");
		return new ModelAndView("redirect:/list",model);
	}
	
	@GetMapping("/delete/{productId}")
	public String delete(Model model, @PathVariable("productId") Long productId) {
		Optional<BaiViet> opt=productservice.findById(productId);
		
		if(opt.isPresent()) {
			productservice.deleteById(productId);
			model.addAttribute("mes", "Product is Deleted");
			return "forward:/list";
		}
		model.addAttribute("mes", "Product is Empty");
		return "forward:/list";
	}
	@RequestMapping("/list")
	public String list(Model model) {
		Long id=(Long) session.getAttribute("accountid");
		List<BaiViet> list=productservice.findByNameAccount(id);
		model.addAttribute("baiviet", list);
		return "ListBlog";
	}
	@RequestMapping("search")
	public String search(Model model, @RequestParam(name="name") String name){
		List<BaiViet> list=null;
		if(!name.isEmpty()) {
			list=productservice.findByNameContaining(name);
		}
		else list=productservice.findAll();
		model.addAttribute("products", list);
		return "home";
	}
	

}
