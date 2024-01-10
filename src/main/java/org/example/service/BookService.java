package org.example.service;

import org.example.entity.Book;
import org.example.repository.BookRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookService {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public BookService() throws Exception {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "myjava123");
    }

    public void addBook(String title, int year, int autherID) throws Exception {
        Book book = new Book(title, year, autherID);
       BookRepository bookRepository = new BookRepository();
        bookRepository.save(book);
        System.out.println("Book saved SUCCESSFULLY! " + book.toString());
    }
}
