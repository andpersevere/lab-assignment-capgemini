package com.cg.springdemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage() {
		return "HomePage";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addProductPage(@ModelAttribute("myForm") Product pro, Map<String, Object> model) {
		List<String> types = new ArrayList<String>();
		types.add("SELECT");
		types.add("Electricity");
		types.add("Grocery");
		types.add("Mobile");

		List<String> yesNo = new ArrayList<String>();
		yesNo.add("Yes");
		yesNo.add("No");

		List<String> features = new ArrayList<String>();
		features.add("5G ");
		features.add("4G ");
		features.add("3G ");
		features.add("2G ");

		model.put("dataItem", types);
		model.put("radioDataItem", yesNo);
		model.put("featureDataItem", features);

		return "AddProductPage";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchPage() {
		return "SearchProductPage";
	}
	

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deletePage() {
		return "DeleteProductPage";
	}


	
	
	
	/************Add Data to Database**************/
	@RequestMapping(value = "/pageSubmit", method = RequestMethod.POST)
	public String addData(@Valid @ModelAttribute("myForm") Product pro, BindingResult result) {
		System.out.println(pro);
		if (result.hasErrors()) {
			return "AddProductPage";
		} else {
			productService.addProduct(pro);
			return "HomePage";
		}
	}
	/************ Get All Data **************/
	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> myList = productService.findAll();
		return new ModelAndView("ShowProductPage", "data", myList);
	}
	/************ Get Searched Data **************/
	@RequestMapping(value = "/searchProduct", method = RequestMethod.GET)
	public ModelAndView searchProduct(@RequestParam("productId") int productId) {
		List<Product> myList = new ArrayList<>();
		myList.add(productService.findByProductId(productId));
		if (myList.get(0) == null) {
			return new ModelAndView("ProductNotFoundPage");
		} else {
			return new ModelAndView("ShowProductPage", "data", myList);
		}

	}
	/************ Get database after deletion of data **************/
	@RequestMapping(value = "/deleteData", method = RequestMethod.GET)
	public ModelAndView deleteData(@RequestParam("pid") int productId) {
		System.out.println(productId);

		if (productService.remove(productId) != null) {
			return new ModelAndView("ProductNotFoundPage");
		} else {
			List<Product> myList = productService.findAll();
			return new ModelAndView("ShowProductPage", "data", myList);
		}
	}

	
}
