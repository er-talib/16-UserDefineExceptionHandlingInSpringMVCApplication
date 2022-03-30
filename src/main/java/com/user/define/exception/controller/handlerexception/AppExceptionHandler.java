package com.user.define.exception.controller.handlerexception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.user.define.exception.userdefineexception.NoBuyarNameFoundException;
import com.user.define.exception.userdefineexception.NoHomePriceException;
import com.user.define.exception.userdefineexception.NoUserNameException;

@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = NoHomePriceException.class)
	public String errorHandlerHomeController(Model model) {
		
		model.addAttribute("error", "Something went wrong.. !!");
		return "errorHomePage";
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String errorHandlerHomeController2(Model model) {
		
		model.addAttribute("error", "Something went wrong.. !!");
		return "errorHomePage2";
	}

	@ExceptionHandler(value = NoBuyarNameFoundException.class)
	public String errorHandlerForMyController3(Model model) {
		
		model.addAttribute("error", "Something went wrong.. !!");
		return "errorHomePage";
	}
	
	@ExceptionHandler(value = NoUserNameException.class)
	public String errorHandlerForMyController4(Model model) {
		
		model.addAttribute("error", "Something went wrong.. !!");
		return "errorHomePage";
	}
}
