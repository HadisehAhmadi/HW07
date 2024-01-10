package org.example.repository;

import org.example.entity.Auther;
import org.example.entity.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookRepository {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public BookRepository() throws Exception{
        Class.forName("org.postgresql.Driver");
        connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","myjava123");
    }

    public void save(Book book) throws Exception {
        preparedStatement=connection.prepareStatement("insert into book values (DEFAULT,?,?,?);");
        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setInt(2, book.getYear());
        preparedStatement.setInt(3,book.getAutherID());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public Book load (int bookID) throws Exception{
        Book book = new Book();
        preparedStatement=connection.prepareStatement("select * from book where id=?");
        preparedStatement.setInt(1,bookID);
        resultSet=preparedStatement.executeQuery();
        while (resultSet.next()) {
            book.setId(Integer.parseInt(resultSet.getString("id")));
            book.setTitle(resultSet.getString("title"));
            book.setYear(Integer.parseInt(resultSet.getString("year")));
            book.setAutherID(Integer.parseInt(resultSet.getString("autherID")));
        }
        resultSet.close();
        preparedStatement.close();
        System.out.println(book);
        return book;
    }

    public void delete (Book book) throws Exception{
        preparedStatement=connection.prepareStatement("delete from book where id=?;");
        preparedStatement.setInt(1,book.getId());
        preparedStatement.close();
    }
}
