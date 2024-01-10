package com.libros.libros.book;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.libros.libros.utils.ListBook;

@Service
public class BookService {
    // List<Book> listBook = List.of(
    //     new Book(1L, "Nuevo Libro", 19.99f, "Autor Desconocido"),
    //      new Book(3L, "Jobs", 20.99f, "Isacsoon")
   
    // );

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository =bookRepository; 
    }


    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBook(Long id){
        return bookRepository.findById(id);
    }

    public Book  registerBook(Book book){
        return bookRepository.save(book);
    }

    public ResponseEntity<Object> ereaseBook(Long id){
        Optional <Book> res = bookRepository.findById(id);
        HashMap<String, Object> data = new HashMap<>();

        if(res.isPresent()){
            bookRepository.deleteById(id);
            data.put("message", "Delete succesfull");
            data.put("data", res);

            return new ResponseEntity<>(
                data, 
                HttpStatus.GONE
            );
        }
        data.put("message", "No existe este registo shuuinsho");
        data.put("data", res);
        


        return new ResponseEntity<>(
            data, 
            HttpStatus.CONFLICT
        );

    }


    public ResponseEntity<Object> updateBook(Book book) {
        
        Optional<Book> bookBd = bookRepository.findBookByName(book.getName());
        HashMap<String, Object> datos = new HashMap<>();


        if(bookBd.isPresent() && book.getId()!=null){
            datos.put("error", true);
            datos.put("message", "Exister producto");
           
      
            return new ResponseEntity<>(
                datos,
                HttpStatus.CONFLICT
            );
        }

              bookRepository.save(book);
            datos.put("message", "uPDATE SUCESSFULL");
            return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
            );
        


    }

}
