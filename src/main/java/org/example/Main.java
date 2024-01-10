package org.example;

import org.example.entity.Auther;
import org.example.entity.Book;
import org.example.repository.AuthorRepository;
import org.example.repository.BookRepository;
import org.example.service.AutherService;
import org.example.service.BookService;

public class Main {
    public static void main(String[] args) throws Exception {

        AuthorRepository authorRepository = new AuthorRepository();
        BookRepository bookRepository = new BookRepository();

        AutherService autherService = new AutherService();
        BookService bookService = new BookService();

        //AuthorRepository save method test
        //Auther auther = new Auther("Mark","Twain",75);
        //authorRepository.save(auther);

        //AuthorRepository load method test
        //authorRepository.load(3);

        //BookRepository save method test
        //Book book = new Book("Madame Bovary",1856,5);
        //bookRepository.save(book);

        //BookRepository load method test
        //bookRepository.load(3);

        //BookRepository delete method test
        //bookRepository.delete(7);

        //AutherService register method test
        //autherService.register("Jean-Paul","Sartre",75);

        //BookService register method test
        //bookService.addBook("Crime And Punishment",1866,13);

        //AutherRepository writtenBooks method test
        authorRepository.writtenBooks(3);
    }
}

