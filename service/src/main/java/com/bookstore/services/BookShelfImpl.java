package com.bookstore.services;

import com.bookstore.models.Book;
import com.bookstore.models.BookShelf;
import com.bookstore.repositories.BookShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookShelfImpl implements BookShelfService{

    @Autowired
    BookShelfRepository bookShelfRepository;

    @Autowired
    BookShelf bookShelf;

    @Override
    public List<Book> getBooksInShelf() {
        return bookShelf.getBooks();
    }

    @Override
    public List<Book> addBookToBookShelf(Book book) {
        List<Book> booksInShelf = getBooksInShelf();
        booksInShelf.add(book);
        return booksInShelf;
    }

}
