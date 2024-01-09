package org.example.repository;

import org.example.entity.Auther;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
        preparedStatement=connection.prepareStatement("insert into auther values (?,?,?,?);");
        preparedStatement.setInt(1,auther.getId());
        preparedStatement.setString(2, auther.getName());
        preparedStatement.setString(3, auther.getFamily());
        preparedStatement.setInt(4,auther.getAge());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        System.out.println("Auther Saved Successfully");
    }
}
