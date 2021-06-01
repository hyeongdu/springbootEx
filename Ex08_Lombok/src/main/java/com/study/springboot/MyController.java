package com.study.springboot;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "<h1>Lombok </h1>";
	}
	
	@RequestMapping("/test1")
	public String test1(Member member, Model model) {
		
		System.out.println(member);
		
		return "test1";
	}



}
