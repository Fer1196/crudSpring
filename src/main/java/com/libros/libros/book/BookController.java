package com.libros.libros.book;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping(path="api/v1/book")


public class BookController {

    //private final BookService bookService; 
    // List<Book> listBook = List.of(
    //     new Book(1L, "Nuevo Libro", 19.99f, "Autor Desconocido"),
    //      new Book(3L, "Jobs", 20.99f, "Isacsoon")
   
    // );

    private final BookService bookService; 
@Autowired
    public BookController( BookService bookService){
        this.bookService=bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
  
    return this.bookService.getBooks();
    }

    
    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable("id")Long id) {
  
    return this.bookService.getBook(id);
    }

    @PostMapping
   public Book registerBook(@RequestBody Book book) {
  
    return this.bookService.registerBook(book);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") Long id){
        return this.bookService.ereaseBook(id);
    }

    @PutMapping()
    public ResponseEntity<Object> postMethodName(@RequestBody Book book) {
      
        return this.bookService.updateBook(book);
    }
    

    
}
