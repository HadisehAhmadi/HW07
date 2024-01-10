package org.example.repository;

import org.example.entity.Auther;
import org.example.entity.Book;

import java.sql.*;

public class AuthorRepository {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public AuthorRepository() throws Exception{
        Class.forName("org.postgresql.Driver");
        connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","myjava123");
    }

    public void save(Auther auther) throws Exception
    {
        preparedStatement=connection.prepareStatement("insert into auther values (DEFAULT,?,?,?);");
        preparedStatement.setString(1, auther.getName());
        preparedStatement.setString(2, auther.getFamily());
        preparedStatement.setInt(3,auther.getAge());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        System.out.println("Auther save SUCCESSFULLY "+auther.toString());
    }

    public Auther load (int autherID) throws Exception{
        Auther auther=new Auther();
        preparedStatement=connection.prepareStatement("select * from auther where id=?");
        preparedStatement.setInt(1,autherID);
        resultSet=preparedStatement.executeQuery();
        while (resultSet.next()) {
            auther.setId(Integer.parseInt(resultSet.getString("id")));
            auther.setName(resultSet.getString("name"));
            auther.setFamily(resultSet.getString("family"));
            auther.setAge(Integer.parseInt(resultSet.getString("age")));
        }
        resultSet.close();
        preparedStatement.close();
        System.out.println("This auther loaded: " +auther);
        return auther;
    }

    public void writtenBooks(int autherID) throws Exception{
        AuthorRepository authorRepository = new AuthorRepository();
        Auther auther = authorRepository.load(autherID);
        Book[] books=new Book[3];
        BookRepository bookRepository = new BookRepository();

        int counter=0;
        preparedStatement = connection.prepareStatement("select book.id from book inner join auther a on book.autherID = a.id where autherID = ?;");
        preparedStatement.setInt(1,autherID);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            books[counter]=bookRepository.load(resultSet.getInt("id"));
            counter++;
        }
        auther.setWrittenBooks(books);
    }
}
