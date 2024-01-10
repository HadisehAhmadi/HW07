package org.example.service;

import org.example.entity.Auther;
import org.example.repository.AuthorRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AutherService {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public AutherService() throws Exception{
        Class.forName("org.postgresql.Driver");
        connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","myjava123");
    }

    public void register (String name,String family,int age) throws Exception{
        int id = 5;
        Auther auther = new Auther(id,name,family,age);
        AuthorRepository authorRepository = new AuthorRepository();
        authorRepository.save(auther);
        System.out.println("Auther saved SUCCESSFULLY! "+auther.toString());
    }
}
