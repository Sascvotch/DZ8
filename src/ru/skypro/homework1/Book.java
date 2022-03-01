package ru.skypro.homework1;

public class Book {
    private String bookName;
    private Author author;
    private int bookYear;

    public Book(String bookName, Author author, int bookYear) {
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }

    public String getBookName () {return bookName;}
    public Author getAuthor () {
        return author;
    }
    public int getBookYear () {
        return bookYear;
    }
    public void setBookYear (int bookYear) {
        this.bookYear=bookYear;
    }


}
