package com.SpringMvcTutorial.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;
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
        List<String> tweets = sr.getTweets()
                .stream()
                .map(Tweet::getText)
                .collect(Collectors.toList());
       
        model.addAttribute("tweets", tweets);
    return "resultPage";
    }
    
    
}
