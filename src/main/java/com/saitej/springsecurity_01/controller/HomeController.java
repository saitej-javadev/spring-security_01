package com.saitej.springsecurity_01.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/")
    public String sayHi() {
        return "Hi folks!!!!";
    }

    @GetMapping("/delete")
    public String delete() {
        return "Modifying data......";
    }
}
