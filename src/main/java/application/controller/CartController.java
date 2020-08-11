package application.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Cart;
import application.model.Product;
import application.service.CartService;
import application.service.ShopUserService;

@Controller
public class CartController{
	@Autowired
	private CartService cartService;
	
	@GetMapping(value = "/cart")
	 public String listCart(Model model) {
        model.addAttribute("carts",cartService.listCart());

        return "cart";
    }
	
	@RequestMapping(value = "/addToCart")
    public String addToCart(@RequestParam("id") int product_id){
        cartService.addToCart(product_id);

        return "redirect:/";
    }
	 @RequestMapping(value="/delete1")
	    public String DeleteProduct(@RequestParam("id") int id) {
	        cartService.deleteProduct(id);

	        return "redirect:/cart";
	    }
}
