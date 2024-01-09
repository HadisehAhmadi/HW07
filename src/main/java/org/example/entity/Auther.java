package org.example.entity;

import java.util.Arrays;

public class Auther {
    private int id;
    private String name;
    private String family;
    private int age;
    private Book[] writtenBooks;

    public Auther(int id, String name, String family, int age) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public Auther() {
    }

    @Override
    public String toString() {
        return "Auther{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", writtenBooks=" + Arrays.toString(writtenBooks) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book[] getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(Book[] writtenBooks) {
        this.writtenBooks = writtenBooks;
    }
}
