package com.bookstore.services;


import com.bookstore.models.Book;

import java.util.List;


public interface BookShelfService {

    List<Book> getBooksInShelf();

    List<Book> addBookToBookShelf(Book book);
}
