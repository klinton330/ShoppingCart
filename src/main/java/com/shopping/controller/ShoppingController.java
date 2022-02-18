package com.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopping.model.ProductModel;

@Controller
public class ShoppingController {

	@RequestMapping("/product")
	public String getShopping(ModelMap map)
	{
		ProductModel model=new ProductModel();
		map.put("products", model.findAll());
		return "product/list";	
	}
}
