package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "";
        for (Book book : books) {
            s = s + book.toString();
        }
        return name + "\n" + s + "\n";
    }

    public Library makeShallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library makeDeepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook : books) {
            Book clonedBook = new Book(theBook.title, theBook.author, theBook.publicationDate);
            clonedLibrary.books.add(clonedBook);
        }
        return clonedLibrary;

    }
}

