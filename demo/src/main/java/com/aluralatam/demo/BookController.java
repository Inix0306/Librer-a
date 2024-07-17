package com.aluralatam.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/search")
    public ResponseEntity<?> searchBookByTitle(@RequestParam String title) {
        try {
            Book book = bookService.findBookByTitle(title);
            return ResponseEntity.ok(book);
        } catch (BookNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/list")
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return bookService.findAllAuthors();
    }

    @GetMapping("/authors/alive")
    public List<Author> getAuthorsAliveInYear(@RequestParam int year) {
        return bookService.findAuthorsAliveInYear(year);
    }

    @GetMapping("/language")
    public List<Book> getBooksByLanguage(@RequestParam String language) {
        return bookService.findBooksByLanguage(language);
    }
}
