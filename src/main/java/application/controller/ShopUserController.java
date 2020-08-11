package application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import application.service.ShopUserService;
import application.model.ShopUser;

@Controller
public class ShopUserController {

    @Autowired
    private ShopUserService shopUserService;

    @PostMapping(value = "/register")
        public String addUser(@RequestParam("name") String name,
                              @RequestParam("username") String username,
                              @RequestParam("zip") int zip,
                              @RequestParam("password") String password,
                              @RequestParam("address") String address,
                              @RequestParam("email") String email) {
        ShopUser user = new ShopUser(email, name, password, username, zip, address);
        shopUserService.registerShopUser(user);

        return "redirect:/";
    }

    @PostMapping(value="/updateUser")
    public String updateUser(@RequestParam("name") String name,
                             @RequestParam("username") String username,
                             @RequestParam("zip") int zip,
                             @RequestParam("address") String address,
                             @RequestParam("email") String email){

        ShopUser user = new ShopUser(email, name, null, username, zip, address);
        shopUserService.updateUserDetails(user);

        return "redirect:/account";
    }

    @PostMapping(value="/updateUserPassword")
    public String updateUserPassword(@RequestParam("newpass") String newpass,
                                     @RequestParam("newpassagain") String newpassagain){

        if(shopUserService.updateUserPassword(newpass, newpassagain, shopUserService.getCurrentUser())){
            return "redirect:/account";
        }

        return "redirect:/account?error=true";
    }

    @GetMapping(value = "/account")
    public String account(Model model){
        String username = shopUserService.getCurrentUser();
        model.addAttribute("user",shopUserService.findByUserName(username));

        return "account";
    }



}
