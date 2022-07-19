package com.example.freemarkerdemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FreeMarkerController {
    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name, Model model){
        String greetingMessage = "Hi "+ name + ",welcome to Freemarker page";
        model.addAttribute("message",greetingMessage);

        return "Welcome";
    }

}
