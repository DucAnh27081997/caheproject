package com.example.cahe.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController {
    public static String TOKEN = "";

    @GetMapping("/change-token/{token}")
    public String changeToken(@PathVariable(value = "token") String token) {
        this.TOKEN = token;
        // xu ly logic lay data
        if("1".equals(token)){
            Notifycation notifycation = new Notifycation("day la thong bao 1","10:15");
        }else {

        }
        //
        return "change token at " + System.currentTimeMillis() / 1000;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "[Hello " + name + "]";
    }

//    @Scheduled(fixedDelay = 3000)
//    public void scheduleFixedDelayTask() {
//        System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);
//    }

    @Scheduled(fixedDelay = 10000, initialDelay = 2000)
    public void scheduleFixedRateWithInitialDelayTask() {
        long now = System.currentTimeMillis() / 1000;
        System.out.println(String.format("[%s]TOKEN = %s", now, TOKEN));
    }

    public class Notifycation{
        public String time;
        public String description;

        public Notifycation(String time, String description) {
            this.time = time;
            this.description = description;
        }
    }
}
