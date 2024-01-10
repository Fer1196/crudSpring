// package com.libros.libros.utils;

// public class Process {
    
// }


// import java.util.ArrayList;
// import java.util.List;

// public class ListBook {
//     private List<Book> listBook;

//     public ListBook() {
//         this.listBook = new ArrayList<>();
//         // Agregar algunos libros iniciales
//         this.listBook.add(new Book(1L, "Nuevo Libro", 19.99f, "Autor Desconocido"));
//         this.listBook.add(new Book(3L, "Jobs", 20.99f, "Isacsoon"));
//     }

//     public List<Book> getListBook() {
//         return listBook;
//     }

//     // Método para agregar un libro
//     public void addBook(Book book) {
//         listBook.add(book);
//     }

//     // Método para borrar un libro por ID
//     public void deleteBookById(Long id) {
//         listBook.removeIf(book -> book.getId().equals(id));
//     }

//     // Método para insertar un libro en una posición específica
//     public void insertBook(int index, Book book) {
//         listBook.add(index, book);
//     }

//     // Método para modificar un libro por ID
//     public void updateBookById(Long id, Book updatedBook) {
//         for (int i = 0; i < listBook.size(); i++) {
//             if (listBook.get(i).getId().equals(id)) {
//                 listBook.set(i, updatedBook);
//                 break;
//             }
//         }
//     }
// }
