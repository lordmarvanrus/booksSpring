package com.example.books;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.Set;

@Component
public class Bookmark {
    private Set<Book> books;

    public Bookmark(Set<Book> books) {
        this.books = books;
    }

    public Book add(Book book) {
        books.add(book);
        return book;
    }

    public Book remove(String bookName) {
        Book deletedBook = null;
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                deletedBook = book;
                books.remove(book);
                break;
            }
        }
        return deletedBook;
    }

    public Set<Book> get() {
        return Collections.unmodifiableSet(books);
    }

    public Book chooseBook(String bookName) {
        Book chosenBook = null;
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                chosenBook = book;
                break;
            }
        }
        return chosenBook;
    }
}
