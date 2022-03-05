package ru.skypro.homework1;
import java.util.Objects;

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
    @Override
    public String toString() {

     return bookName+ ": " + author.toString() +": " +bookYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return bookName.equals(book.bookName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}
