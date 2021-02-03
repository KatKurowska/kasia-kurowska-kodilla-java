package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given

        Library library1 = new Library("Main Library");
        Book book1 = new Book("The Sicilian","Mario Puzo", LocalDate.of(1984,01,01));
        Book book2 = new Book("Il nome della rosa","Umberto Eco", LocalDate.of(1980,01,01));
        Book book3 = new Book("Kodeks karny","NO AUTHOR", LocalDate.of(2011,01,01));
        Book book4 = new Book("Maskerade","Terry Pratchett", LocalDate.of(2003,01,01));
        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);
        library1.getBooks().add(book4);

        //creating shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library1.makeShallowCopy();
            clonedLibrary.setName("Main Library - shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //creating deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library1.makeDeepCopy();
            deepClonedLibrary.setName("Deep Cloned Public Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //While
        library1.getBooks().remove(book1);

        //Then
        System.out.println(library1);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library1.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());


    }
}

