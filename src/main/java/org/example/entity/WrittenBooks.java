package org.example.entity;

public class WrittenBooks {
    private int id;
    private String autherName;
    private String bookName;

    public WrittenBooks(int id, String autherName, String bookName) {
        this.id = id;
        this.autherName = autherName;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "WrittenBooks{" +
                "id=" + id +
                ", autherName='" + autherName + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
