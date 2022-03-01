package ru.skypro;

import ru.skypro.homework1.Author;
import ru.skypro.homework1.Book;

public class Main {

    public static void main(String[] args) {
        Author sKing = new Author("Stiven", "King");
        Author vZukov = new Author("Vitaly", "Zykov");
        Book bookFirst = new Book("The dark tower", sKing, 1982);
        Book bookSecond = new Book("Nameless slave", vZukov, 1982);
        bookFirst.setBookYear(1983);
        System.out.println(sKing.getAuthorName());
        System.out.println(sKing.getAuthorLastName());
        System.out.println(bookFirst.getBookName());
        System.out.println(bookFirst.getBookYear());
    }
}