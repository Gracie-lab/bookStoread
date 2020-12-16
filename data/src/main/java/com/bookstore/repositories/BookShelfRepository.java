package com.bookstore.repositories;

import com.bookstore.models.Book;
import com.bookstore.models.BookShelf;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface BookShelfRepository extends JpaRepository<BookShelf, Integer> {
    List<Book> findAllBooks();
}
