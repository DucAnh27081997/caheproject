package com.example.cahe.test;

import com.example.cahe.model.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class MAIN {
    public static void main(String[] args) throws JsonProcessingException {
        ZoneId localZoneId = ZoneId.systemDefault();
        ZonedDateTime localZonedDateTime = ZonedDateTime.now(localZoneId);
        System.out.println("Local time: " + localZonedDateTime);

        ZoneId japanZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime japanZonedDateTime = ZonedDateTime.now(japanZoneId);
        System.out.println("Japan time: " + japanZonedDateTime);

        // Convert local time to UTC
        ZoneId utcZoneId = ZoneId.of("UTC");
        ZonedDateTime utcZonedDateTime = localZonedDateTime.withZoneSameInstant(utcZoneId);
        Instant utcInstant = utcZonedDateTime.toInstant();
        System.out.println("UTC time: " + utcZonedDateTime);

        System.out.println("compare " + japanZonedDateTime.compareTo(localZonedDateTime) );
        System.out.println("JAPAN getDayOfMonth " + japanZonedDateTime.getDayOfMonth() );
        System.out.println("JAPAN getDayOfWeek " + japanZonedDateTime.getDayOfWeek());

        ZonedDateTime DecemberJapan = japanZonedDateTime.withDayOfMonth(12);
        System.out.println("JAPAN DecemberJapan " + DecemberJapan);

        System.out.println("JAPAN withDayOfMonth " + DecemberJapan.getDayOfMonth());
    }
}
