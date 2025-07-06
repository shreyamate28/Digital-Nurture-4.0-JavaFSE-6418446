package com.example.library;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<Book> findAllBooks() {
        return Arrays.asList(
                new Book("Spring in Action"),
                new Book("Effective Java")
        );
    }
}
