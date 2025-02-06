package com.webtintuc.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.webtintuc.model.Account;
import com.webtintuc.model.BaiViet;
import com.webtintuc.model.Category;
import com.webtintuc.repo.AcountRepository;
import com.webtintuc.repo.BaiVietRepository;
import com.webtintuc.repo.CategoryRepository;


import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Controller
@RequestMapping("")
public class HomeCotroller {
	@Autowired
    private HttpSession session;
	@Autowired
    private BaiVietRepository baiVietRepository;
	@Autowired
    private CategoryRepository categoryRepository;
	@Autowired
    private AcountRepository acountRepository;
	@RequestMapping("/")
	public String hone(Model model ) {
//		return "redirect:/customer/home"; 
		List<BaiViet>baiViets= baiVietRepository.findAll();
//				.stream().map(item->{
//			Account acc=acountRepository.findById(item.getAccount().getId()).get();
//			item.setAccount(acc);
//			return item;
//		}).collect(Collectors.toList());
		model.addAttribute("baiviet", baiViets);
		List<Category>categories= categoryRepository.findAll();
		model.addAttribute("category", categories);
		return "home";
	}
	@RequestMapping("/blog/{id}")
	public String blog(Model model, @PathVariable("id") Long id ) {
		BaiViet baiViet=baiVietRepository.findById(id).get();
		model.addAttribute("baiHoc", baiViet);
		return "Blog";
	}
	
	
}
