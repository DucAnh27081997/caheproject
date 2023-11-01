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

    @GetMapping(value = "/get-data-3")
    public String[] getData3(String key) {
        long a = 0;
        long b = 3;
        System.out.printf("a + b = %s", a + b);
        System.out.println("1");
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        return myService.getCachedData(key);
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
