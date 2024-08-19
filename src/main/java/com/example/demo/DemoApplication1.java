package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoApplication1 {

	@GetMapping("emp")
	public String Employee() {
		return "Employees";
	}
	@GetMapping("/home")
	public String Home() {
		return "home";
	}
	@GetMapping("/home2")
	public String Home2() {
		return "home2";
	}
	@GetMapping("/hello")
	@ResponseBody
    public String show(){
		return "HI India";
	}
	
}
