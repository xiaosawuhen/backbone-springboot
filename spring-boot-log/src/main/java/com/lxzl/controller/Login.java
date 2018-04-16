package com.lxzl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class Login {
	
	Logger logger = LoggerFactory.getLogger(Login.class);

	@RequestMapping("/")
	@ResponseBody
	public String login() {
		
		logger.debug("123123");
		logger.info("123");
		
		return "123";
	}
}
