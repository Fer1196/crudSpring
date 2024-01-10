package com.libros.libros.utils;

import java.util.List;

import com.libros.libros.book.Book;

public class ListBook {


    public static List<Book> listBook = List.of(
        new Book(1L, "Nuevo Libro", 19.99f, "Autor Desconocido"),
         new Book(3L, "Jobs", 20.99f, "Isacsoon")
   
    );

    public static List<Book> getListBook() {
        return listBook;
    }

    
}
