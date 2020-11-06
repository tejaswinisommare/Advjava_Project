package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Users;
import com.cdac.service.UsersService;
import com.cdac.valid1.UsersValidator;


@Controller
public class UsersController {
	
	@Autowired
	private UsersService userService;
	@Autowired
	private UsersValidator usersValidator;
	
	
	@RequestMapping("/reg_form")
	public String showform1() {
		return "reg_form";
	}

	@RequestMapping(path =  "/process1",method = RequestMethod.POST)
	public String register(Users userlogin,ModelMap modelMap) {
		userService.addUser(userlogin);
		return "login_form2";
	}
	
	
	@RequestMapping("/login_form2")
	public String showform() {
		return "login_form2";
	}
	
	@RequestMapping(path = "/processform",method=RequestMethod.POST)
      public String userlogin(Users userlogin,BindingResult result,ModelMap map,HttpSession session) {
		usersValidator.validate(userlogin, result);
		if(result.hasErrors()) {
			return "login_form2";
		}

		boolean b = userService.findUser(userlogin);
		if(b) {
			session.setAttribute("userlogin",userlogin);
			return "home";
		}else {
			map.put("userlogin", new Users());
			return "login_form2";
		}	
		
	}
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String logout(Users userlogin,ModelMap map,HttpSession session) {
		   session.getAttribute("userlogin");
       session.removeAttribute("userlogin");	
       session.invalidate();
		return "Welcome";
	}
	
	

}
	


