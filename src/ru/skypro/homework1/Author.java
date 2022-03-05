package ru.skypro.homework1;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorLastName;

    public Author(String authorName, String authorLastName) {
        this.authorName = authorName;
        this.authorLastName = authorLastName;

    }

    public String getAuthorName () {
        return authorName;
    }
    public String getAuthorLastName () {
        return authorLastName;
    }
    @Override
    public String toString() {

        return authorName+ " " + authorLastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
       Author author = (Author) other;
        return authorName.equals(author.authorName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorName);
    }
}
