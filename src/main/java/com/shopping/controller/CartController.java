package com.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopping.entity.Item;
import com.shopping.model.ProductModel;

@Controller
@RequestMapping("/cart")
public class CartController {
	@RequestMapping("/index")
	public String getCart() {
		System.out.println("Get Cart called");
		return "cart/index";
	}

	@RequestMapping("/buy/{id}")
	public String buy(@PathVariable String id, HttpSession session) {
		System.out.println(id);
		System.out.println("Buy Cart Called");
		ProductModel pm = new ProductModel();
		if (session.getAttribute("cart") == null) {
			List<Item> list = new ArrayList<Item>();
			list.add(new Item(pm.findById(id), 1));
			session.setAttribute("cart", list);
		} else {
			List<Item> list = (List<Item>) session.getAttribute("cart");
			int index = exixt(list, id);
			if (index == -1) {
				list.add(new Item(pm.findById(id), 1));
			} else {
				int quantity = list.get(index).getQuantity() + 1;
				list.get(index).setQuantity(quantity);
			}
			session.setAttribute("cart", list);
		}
		return "redirect:/shopping/cart/index";
	}

	private int exixt(List<Item> list, String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getProduct().getId().equalsIgnoreCase(id)) {
				return i;
			}
		}
		return -1;
	}

}
