package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Koszykowa");
        IntStream.iterate(1, n -> n = n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.now())));
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Płytki Klon Koszykowa");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);


        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Głęboki klon Koszykowa");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When

        //Then
        assertEquals(10, library.books.size());
        assertEquals(10, deepClonedLibrary.books.size());
        assertEquals(10, clonedLibrary.books.size());

    }
}
