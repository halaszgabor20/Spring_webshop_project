package application.controller;

import application.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

    @PostMapping(value = "/addProduct")
    public String addUser(@RequestParam("product_name") String product_name,
                          @RequestParam("product_price") int product_price,
                          @RequestParam("product_category") String product_category,
                          @RequestParam("product_img") String product_img,
                          @RequestParam("product_active") Boolean product_active) {
        Product product = new Product(product_name, product_active ,  product_price, product_category, product_img);
        productService.addProduct(product);

        return "redirect:/";
    }
	
	@PostMapping(value="/search")
    public String findProductByName(Model model, @RequestParam(required=false, name = "searchParam") String searchParam){
	    if (searchParam.isEmpty()) {
            model.addAttribute("products",productService.listProducts());
        } else {
            model.addAttribute("products", productService.searchProduct(searchParam));
        }

    	return "index";
    }
	
    @GetMapping(value = "/")
    public String listProducts(Model model) {
        model.addAttribute("products",productService.listProducts());

        return "index";
    }

    @RequestMapping(value="/delete")
    public String DeleteProduct(@RequestParam("id") int id) {
        productService.deleteProduct(id);

        return "redirect:/";
    }
    
    
}
