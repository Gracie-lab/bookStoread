package com.bookstore.models;

import com.bookstore.models.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookShelf {

    @Id
    private Integer id;

    @OneToMany
    private List<Book> books;

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
//        return Collections.emptyList();
        return books;
    }
}
