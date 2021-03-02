package com.nt.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.bo.Customer;

@Controller
//Binding the data from both sides, i.e., view to model and model to view via controller is called 2 way binding 
//to implement the data binding we have to use spring tags
public class CustomerController {

	@GetMapping("/")//this method will be called automatically
	public String launch() {
		return "redirect:register";
	}
	
	@GetMapping("/register")
		public String showHome(Map<String,Object> map ) {
		Customer bo=new Customer();
		bo.setCustomerName("please enter ur name here");
		bo.setBillAmount(0.0f);
		bo.setAddress("your address here");
		map.put("custData", bo);
		return "applicationform";
	}
	
	@PostMapping("/register")
	//if u dont give uri then it is default mapping, u can give @RequestMapping("/")
	public String showHome(RedirectAttributes map,@ModelAttribute("custData")Customer bo) {
		map.addFlashAttribute("map", bo);
		System.out.println("modifed code for 2 way binding");
		return "CustomerDashboard";
	}
//	@GetMapping("/regsuccess")
//	public String regsuccess(@ModelAttribute("custData")Customer bo) {
//		System.out.println("after redirect model attr details are add->"+bo.getAddress()+"billamnt"+bo.getBillAmount());
//		return "CustomerDashboard";
//	}
	
	
}
