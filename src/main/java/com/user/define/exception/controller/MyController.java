package com.user.define.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.define.exception.service.MyService;

@Controller
@RequestMapping("/my")
public class MyController {
	
	@Autowired
	public MyService myService ;
	
	@RequestMapping("/buyer")
	public String myHandler(@RequestParam String name , Model model) {
		String providerName = this.myService.providerName(name);
		model.addAttribute("name", "Home provider name is 	" + providerName);
		return "myPage";
	}

}
