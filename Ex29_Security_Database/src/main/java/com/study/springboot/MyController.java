package com.study.springboot;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class MyController {

	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		String encoded=new BCryptPasswordEncoder().encode("123");
		System.out.println(encoded);

		return "<h1>Security Ex29 </h1>";
	}
	
	@RequestMapping("/guest/welcome")
	public String welcome1() throws Exception {
		return "guest/welcome1";
	}
	
	@RequestMapping("/member/welcome")
	public String welcome2() throws Exception {
		return "member/welcome2";
	}
	
	@RequestMapping("/admin/welcome")
	public String welcome3() throws Exception {
		return "admin/welcome3";
	}
	@RequestMapping("/loginForm")
	public String loginForm() throws Exception {
		return "security/loginForm";
	}
	
//	@RequestMapping("/loginError")
//	public String loginError() throws Exception {
//		return "security/loginError";
//	}



}
