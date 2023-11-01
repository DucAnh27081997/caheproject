package com.example.cahe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String Add() {
        return "HELLO";
    }

    @RequestMapping(value = "add2", method = RequestMethod.GET)
    public String Add2() {
        return "HELLO";
    }

    private static final String URL_CONFIG = "localhost";
    private static final String PORT_CONFIG = "8080";
}
