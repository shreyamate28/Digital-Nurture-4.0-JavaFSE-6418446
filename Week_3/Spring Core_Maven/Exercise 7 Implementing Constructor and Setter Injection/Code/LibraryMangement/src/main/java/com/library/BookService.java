package com.library;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    // Constructor Injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printAllBooks() {
        System.out.println("Service: " + serviceName);
        List<Book> books = bookRepository.findAllBooks();
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
