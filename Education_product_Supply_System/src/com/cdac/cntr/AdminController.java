package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Admin;
import com.cdac.dto.Users;
import com.cdac.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/admin_reg")
	public String showform1() {
		return "admin_reg";
	}

	@RequestMapping(path =  "/process",method = RequestMethod.POST)
	public String register(Admin adminlogin,ModelMap modelMap) {
		adminService.addAdmin(adminlogin);
		return "login_form";
	}

	
	
	@RequestMapping("/login_form")
	public String showform2() {
		return "login_form";
	}

	
	@RequestMapping(path = "/processform1",method=RequestMethod.POST)
	public String adminlogin(Admin adminlogin,ModelMap map,HttpSession session) {
		boolean b1 = adminService.findAdmin(adminlogin);
		
		if(b1) {
			session.setAttribute("adminlogin",adminlogin);
			return "Adminhome";
		}else {
			map.addAttribute("em1", "Admin Not Found, try again");
			map.put("adminlogin", new Admin());
            return "login_form";
            }

	}
	
	@RequestMapping(value = "/index1",method = RequestMethod.GET)
	public String logout(Admin adminlogin,ModelMap map,HttpSession session) {
		   session.getAttribute("adminlogin");
       session.removeAttribute("adminlogin");	
       session.invalidate();
		return "Welcome";
	}

}
	
	

 