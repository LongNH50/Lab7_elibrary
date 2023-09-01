package com.example.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HompageController {


    @GetMapping("/")
    public String getHomepage(){
        return "home/index";
    }

}
