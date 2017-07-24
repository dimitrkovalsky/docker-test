package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dkovalskyi on 24.07.2017.
 */
@RestController
public class Hello {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

}
