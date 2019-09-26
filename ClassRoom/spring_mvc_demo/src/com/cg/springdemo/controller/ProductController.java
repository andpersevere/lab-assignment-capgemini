package com.cg.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springdemo.dto.Product;
import com.cg.springdemo.service.ProductService;

@Controller
public class ProductController {
 
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homePage() {
	
		return "home";
	}
	@RequestMapping(value="/addPage", method=RequestMethod.GET)
	public String addProduct(@ModelAttribute("myForm") Product pro) {
		return "AddProduct";
	}
	
	@RequestMapping(value="/pageSubmit", method=RequestMethod.POST)
	public String addDate(@ModelAttribute("myForm") Product pro){
		System.out.println(pro);
		productService.addProduct(pro);
		return "home";
	}
	@RequestMapping(value="/showAll", method = RequestMethod.GET) 
	public ModelAndView getAllData() {
		List<Product> myList = productService.findAll();
		
		return new ModelAndView("ShowProduct", "data", myList );
		
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deletePage() {
		
		return "DeleteProduct";
	}
	
	@RequestMapping(value="/deleteData", method=RequestMethod.POST)
	public String deleteData(@RequestParam("pid") int productId) {
		System.out.println(productId);
		productService.remove(productId);
		//return new ModelAndView("DeleteProductt", "", modelObject);
		return "redirect:/showAll";
	}
}
