package com.user.define.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.define.exception.service.HomeService;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	public HomeService homeService;

	@RequestMapping("/price")
	public String homeHandler(@RequestParam("homeNo") String homeNo, Model model) {
		Double homePrice = this.homeService.findHomePrice(homeNo);
		model.addAttribute("homePrice", "Home price is..!!! " + homePrice);

		return "homepage";
	}

	@RequestMapping("/value")
	public String homeHandler2( Model model) {

		model.addAttribute("homeValue", "Real time value of this home is 1500000 ..!!!");

//		 String s = null;
//		 s.length();
		return "homepage";
	}

}
