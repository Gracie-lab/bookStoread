package com.bookstore.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookShelfTest {
    BookShelf bookShelf;

    @BeforeEach
    void setUp() {
        bookShelf = new BookShelf();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatBookShelfIsEmptyWhenNoBookIsAdded(){
        List<Book> books = bookShelf.getBooks();
        assertTrue(books.isEmpty());
    }

    @Test
    void testThatBookHasBooksWhenAdded(){
        List<Book> booksInShelf = bookShelf.getBooks();
        booksInShelf.add(new Book("Clean code"));
        booksInShelf.add(new Book("Deitel"));
        int size = booksInShelf.size();
        assertEquals(2, size);
    }
}