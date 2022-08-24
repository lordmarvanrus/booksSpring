package com.example.books;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/library")
public class BooksUserController {

    private BooksService booksService;

    public BooksUserController(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping("/get")
    public Set<Book> get() {
        return booksService.get();
    }

    @RequestMapping("/chooseBook")
    public Book chooseBook(@RequestParam("bookName") String bookName) {
        return booksService.chooseBook(bookName);
    }


}
