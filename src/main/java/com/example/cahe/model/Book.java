package com.example.cahe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

public class Book {
    private Integer id;
    private String name;
    private Integer pages;
    private String author;
    private Double cost;

    public Book(Integer id, String name, Integer pages, String author, Double cost) {
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", cost=" + cost +
                '}';
    }
}
