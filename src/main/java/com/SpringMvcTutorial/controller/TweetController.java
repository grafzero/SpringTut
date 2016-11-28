/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringMvcTutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author Maciek Slotwinski (maciekslotwinski@gmail.com)
 */
@Controller
public class TweetController {
   @Autowired
   private Twitter twitter;
    @RequestMapping ("/")
    public String hello(@RequestParam(value="search", defaultValue="Andrzej Duda") String search, Model model){
        SearchResults sr = twitter.searchOperations().search(search);
        String text = sr.getTweets().get(0).getText();
        model.addAttribute("message", text);
    return "resultPage";
    }
    
    
}
