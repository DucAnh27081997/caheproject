package com.example.cahe.service;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

public class MyService {

    String[] A = new String[]{"A1", "A1", "A1", "1", "B",};
    String[] B = new String[]{"B1", "B1", "C1", "C1", "B",};

    @Cacheable(value = "yourCacheName", key = "#yourKey")
    public String[] getCachedData(String yourKey) {
        // Logic để truy vấn dữ liệu vào đây
        if(yourKey.equals("A")){
            System.out.printf("vào A");
            return A;
        }
        System.out.printf("vào B");
        return B;
//        return "Data from cache";
    }
}
