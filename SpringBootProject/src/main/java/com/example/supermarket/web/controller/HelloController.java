package com.example.supermarket.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping // @RequestMapping(method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("msg", "Hello, world!");
        return "hello";
    }
}
