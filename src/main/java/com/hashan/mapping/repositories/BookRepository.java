package com.hashan.mapping.repositories;

import com.hashan.mapping.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    Book getByBookId(Long bookId);
}
