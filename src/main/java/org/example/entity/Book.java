package org.example.entity;

public class Book {
    private int id;
    private String title;
    private int year;
    private int autherID;

    public Book(String title, int year,int autherID) {
        this.autherID= autherID;
        this.title = title;
        this.year = year;
    }

    public Book() {}

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", autherID=" + autherID +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAutherID() {
        return autherID;
    }

    public void setAutherID(int autherID) {
        this.autherID = autherID;
    }
}
