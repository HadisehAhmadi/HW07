package org.example;

import org.example.entity.Auther;
import org.example.repository.AuthorRepository;

public class Main {
    public static void main(String[] args) throws Exception {
        AuthorRepository authorRepository = new AuthorRepository();
        //Auther auther = new Auther(4,"Jules","Verne",77);
        //authorRepository.save(auther);
        Auther auther = authorRepository.load(4);

    }
}