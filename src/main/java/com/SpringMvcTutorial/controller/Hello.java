/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringMvcTutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Maciek Slotwinski (maciekslotwinski@gmail.com)
 */
@Controller
public class Hello {
    @RequestMapping ("/")
    @ResponseBody
    public String hello(){
    return "Hello world";
    }
    
    
}
