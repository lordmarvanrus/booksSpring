package com.example.books;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BooksService {

    private Bookmark bookmark;

    private BookReader bookReader;

    public BooksService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public BooksService(Bookmark bookmark) {
        this.bookmark = bookmark;
    }

    public Book add(String bookName, String authorName, String authorSurname) {
        Author author = new Author(authorName, authorSurname);
        Book book = new Book(bookName, author);
        return bookmark.add(book);
    }

    public Book remove(String bookName) {
        return bookmark.remove(bookName);
    }

    public Set<Book> get() {
        return bookmark.get();
    }
    public Book chooseBook(String bookName) {
        return bookReader.chooseBook(bookName);
    }
}
