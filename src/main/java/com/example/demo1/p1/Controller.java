package com.example.demo1.p1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {
    @GetMapping("/getName")
    public String getName(){
        return "andy:"+(new Date()).toString();
    }
}
