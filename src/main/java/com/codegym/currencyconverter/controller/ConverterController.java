package com.codegym.currencyconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ConverterController {
    @GetMapping("/")
    public ModelAndView showForm(){
        return new ModelAndView("form");
    }
    @PostMapping("/convert")
    public ModelAndView convert(@RequestParam("rate") double rate,
                          @RequestParam("usd") double usd){
        double vnd = rate*usd;
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("vnd", vnd);
        modelAndView.addObject("usd", usd);
        modelAndView.addObject("rate", rate);
        return modelAndView;
    }
}
