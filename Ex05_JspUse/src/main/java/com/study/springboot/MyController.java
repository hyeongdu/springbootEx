package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "JSP in Gradle";
	}
	
	@RequestMapping("/test1")
	public String test1() throws Exception {
		return "test1";
	}
	
	@RequestMapping("/test2")
	public String test2() throws Exception {
		return "sub/test2";
	}


}
