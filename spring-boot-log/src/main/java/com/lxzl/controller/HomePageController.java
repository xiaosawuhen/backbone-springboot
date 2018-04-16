package com.lxzl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxzl.bean.BaseInfo;

@RestController
public class HomePageController {

	Logger logger = LoggerFactory.getLogger(HomePageController.class);

	@RequestMapping("/")
	@ResponseBody
	public String index(@RequestBody(required=false) BaseInfo baseInfo) {
		logger.debug("index");
		
		if(baseInfo != null) {
			System.out.println(baseInfo.getName() + ":" + baseInfo.getAge());
		}

		return "{\"name\":\"wnn\"}";
	}
}
