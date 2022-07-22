package com.ekart.ecommerce.authcontroller;

import com.ekart.ecommerce.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @GetMapping("/signup")
    public String GetForm(Model model)
    {
        model.addAttribute("User", new User());
        return "signup_form";
    }
}
