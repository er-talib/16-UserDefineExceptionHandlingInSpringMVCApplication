package com.user.define.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.define.exception.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService service ;
	
	@RequestMapping("/value")
	public String userHandler(@RequestParam String name , Model model) {
	    String buyersName = this.service.homeBuyersName(name);
	    model.addAttribute("userName", "Buyer name is " +  buyersName);
		
		return "userPage";
	}

}
