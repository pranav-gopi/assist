package com.pranav.assist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value="/test")
	public @ResponseBody String test(){
		return "this is test";
	}
	
	@RequestMapping(value="/home")
	public String home(){
		return "home/index";
	}
}
