package com.example.books;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Component
@SessionScope
public class BookReader {

    private Book currentBook;

    private Bookmark bookmark;

    public BookReader(Bookmark bookmark) {
        this.bookmark = bookmark;
    }

    public Book chooseBook(String bookName) {
        return bookmark.chooseBook(bookName);
    }
}

