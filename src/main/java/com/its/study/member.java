package com.its.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class member {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
