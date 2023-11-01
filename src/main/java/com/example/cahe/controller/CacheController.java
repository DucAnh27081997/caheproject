package com.example.cahe.controller;

import com.example.cahe.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {
    MyService myService = new MyService();

    @GetMapping(value = "/get-data")
    public String[] getData(String key) {
        return myService.getCachedData(key);
    }

    @GetMapping(value = "/get-data-2")
    public String[] getData2(String key) {
        return myService.getCachedData(key);
    }

    @GetMapping(value = "/get-data-4")
    public String[] getData4(String key) {
        return myService.getCachedData(key);
    }
}
