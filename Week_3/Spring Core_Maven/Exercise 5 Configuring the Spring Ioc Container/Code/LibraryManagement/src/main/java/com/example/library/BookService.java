package com.example.library;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Spring to inject dependency
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printAllBooks() {
        List<Book> books = bookRepository.findAllBooks();
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
