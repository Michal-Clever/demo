package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    //   "/"

    @GetMapping("/")
  //  @ResponseBody
    public String index() {
        return "index";
    }

    
    @GetMapping("/podstrona")
    @ResponseBody
    public String podstrona() {
        return "podstrona";
    }

}
