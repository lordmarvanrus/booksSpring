package com.example.books;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/library")
public class BooksController {

    private BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping("/add")
    public Book add(@RequestParam("bookName") String bookName,
                             @RequestParam("authorName") String authorName,
                             @RequestParam("authorSurname") String authorSurname) {
        return booksService.add(bookName, authorName, authorSurname);
    }

    @RequestMapping("/remove")
    public Book remove(@RequestParam("bookName") String bookName) {
        return booksService.remove(bookName);
    }

    @RequestMapping("/get")
    public Set<Book> get() {
        return booksService.get();
    }
}
