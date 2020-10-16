package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class LibraryTestSuite {

    private static final Library library = new Library("Koszykowa");


    @Test
    void testShallowCopy() throws CloneNotSupportedException {
        //Given
        IntStream.iterate(1, n -> n = n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.now())));

        Library clonedLibrary = null;
        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Płytki Klon Koszykowa");
        //When
        library.getBooks().removeAll(library.getBooks());
        //Then
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
    }

    @Test
    void testDeepCloned() throws CloneNotSupportedException {
        //Given
        IntStream.iterate(1, n -> n = n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.now())));

        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Głęboki klon Koszykowa");
        //When
        library.getBooks().removeAll(library.getBooks());
        //Then
        //assertEquals(10, library.getBooks().size());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
