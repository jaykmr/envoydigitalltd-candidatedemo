package com.envoydigitalltd.candidatedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping(value = "/**/c-{categoryCode:.*}")
public class ProductsPageController {

	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView helloWorld() {  
        String message = "HELLO SPRING MVC HOW R U";  
        return new ModelAndView("home", "message", message);  
    }
}
