package com.example.cahe.controller;

import com.example.cahe.model.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MAIN {
    public static void main(String[] args) throws JsonProcessingException {
        Book book = new Book(1, "book1", 1, "ducla1", 0.5d);

        List<Book> list = Arrays.asList(
                new Book(1, "book1", 1, "ducla1", 0.5d),
                new Book(1, "book1", 1, "ducla1", 0.5d),
                new Book(2, "book1", 1, "ducla1", 0.5d),
                new Book(1, "book1", 1, "ducla1", 0.5d),
                new Book(3, "book1", 1, "ducla1", 0.5d),
                new Book(3, "book1", 1, "xaxaxa", 0.5d)
        );

//        ObjectMapper ob = new ObjectMapper();

        for (Book b: list.stream().distinct().collect(Collectors.toList())) {
            System.out.println(b.toString());
        }
    }
}
