package com.bitcamp.web.controller;

import com.bitcamp.web.common.util.Printer;
import com.bitcamp.web.service.NoticeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
 public class HomeController{
    @Autowired Printer p;
   

     @RequestMapping("/") 
     public String index() {
       
         return "index"; 
     }

 }
