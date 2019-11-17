package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Homepage(){
        return "Home";
    }
    @GetMapping("/github")
    public String Githubpage(){
        return "github";
    }
    @GetMapping("/corejava")
    public String corejavapage(){
        return "corejava";
    }
    @GetMapping("/htmlCssBootstrap")
    public String htmlCssBootstrappage(){
        return "htmlCssBootstrap";
    }
    @GetMapping("/objectOriented")
    public String objectOrientedpage(){
        return "objectOriented";
    }
    @GetMapping("/pda")
    public String pdapage(){
        return "pda";
    }
    @GetMapping("/test")
    public String testpage(){
        return "test";
    }

}
