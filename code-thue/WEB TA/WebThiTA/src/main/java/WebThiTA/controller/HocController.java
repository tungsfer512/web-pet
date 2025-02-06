package WebThiTA.controller;


import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import WebThiTA.dto.BaiThiDTO;
import WebThiTA.model.BaiHoc;
import WebThiTA.model.BaiThi;
import WebThiTA.model.CauHoi;
import WebThiTA.reponsitory.BaiHocRepo;
import WebThiTA.reponsitory.BaiThiRepo;
import WebThiTA.reponsitory.CauHoiRepo;

@Controller
@RequestMapping("")
public class HocController {
    
    @Autowired
    private BaiHocRepo baiHocRepo;
    @RequestMapping("/khoahoc")
    public String baithi(Model model, HttpServletRequest request) {
        //authen
        HttpSession ss= request.getSession();
        if(ss.getAttribute("username")==null)
            return new String( "redirect:/login");
        //lấy bai thi
        List<BaiHoc> listBaiHoc= baiHocRepo.findAll();
        model.addAttribute("listBaiHoc", listBaiHoc);
        return "KhoaHoc";
        
    }
    @RequestMapping("/khoahoc/{lessonId}")
    public String baithi(Model model, HttpServletRequest request,@PathVariable("lessonId") Long lessonId) {
        //authen
        HttpSession ss= request.getSession();
        if(ss.getAttribute("username")==null)
            return new String( "redirect:/login");
        //lấy bai thi
        System.out.println(lessonId);
        Optional<BaiHoc> baiHoc= baiHocRepo.findById(lessonId);
        model.addAttribute("baiHoc", baiHoc.get());
        return "BaiHoc";
        
    }
    
    
    
}
