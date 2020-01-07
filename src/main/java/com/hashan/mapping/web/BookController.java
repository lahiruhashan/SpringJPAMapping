package com.hashan.mapping.web;

import com.hashan.mapping.domain.Book;
import com.hashan.mapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
@CrossOrigin
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("")
    public ResponseEntity<Book> addABook(@RequestBody Book book) {
        return new ResponseEntity<Book>(bookService.saveOrUpdateABook(book), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Book> getAllBookings(){
        return bookService.findAll();
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookingById(@PathVariable Long bookId) {
        return new ResponseEntity<Book>(bookService.findBookById(bookId), HttpStatus.OK);
    }
}
