package com.doglover.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller  
public class MyController {  
      
    @RequestMapping(value="login") 
    private @ResponseBody User  hello(User user){  
        return user;  
    }  
} 
