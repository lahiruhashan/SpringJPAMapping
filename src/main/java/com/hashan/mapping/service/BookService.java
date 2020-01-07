package com.hashan.mapping.service;

import com.hashan.mapping.domain.Book;
import com.hashan.mapping.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveOrUpdateABook(Book book) {
        return bookRepository.save(book);
    }

    public Book findBookById(Long bookId) {
        return bookRepository.getByBookId(bookId);
    }

    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
