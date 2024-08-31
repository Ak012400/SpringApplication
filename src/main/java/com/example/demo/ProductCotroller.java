package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductCotroller {
	List<Product> l1;
	
	 ProductCotroller(){
		Product p1=new Product("Sweet home",45.20,true);
		Product p2=new Product("sweet chiki masala",87.32,true);
		Product p3=new Product("Sweet jalebi",444.20,true);
		Product p4=new Product("sweet dhosa masala",37.32,false);
		Product p5=new Product("Sweet angur",48.20,true);
		Product p6=new Product("sweet chat masala",88.32,false);
		l1= Arrays.asList(p1,p2,p3,p4,p5,p6);
	}
	 @GetMapping("/showProducts")
	 public ModelAndView showProducts() {
		 ModelAndView m1=new ModelAndView();
		 m1.setViewName("Values");
		 m1.addObject("Product",l1);
		 return m1;
	 }
	 @RequestMapping("/myname")
	 public ModelAndView myName(){
		ModelAndView m1=new ModelAndView();
		m1.setViewName("Free");
		m1.addObject("MyName", "Arun");
		return m1;
	 }
	 @GetMapping("/Input")
	 public ModelAndView input(){
      ModelAndView m1=new ModelAndView();
	  m1.setViewName("Input");
	  return m1;

	 }
	 @PostMapping("/submit")
public ModelAndView submit(@RequestParam("name") String name,@RequestParam("age") int age,@RequestParam("email") String Email) {
  ModelAndView modelAndView = new ModelAndView();
  modelAndView.setViewName("result");
  modelAndView.addObject("name", name);
  modelAndView.addObject("age", age);
  modelAndView.addObject("email", Email);
  return modelAndView;
}

}
