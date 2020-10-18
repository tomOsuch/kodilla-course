package com.kodilla.patterns.prototype.library;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class LibraryTestSuite {

    private static final Library library = new Library("Koszykowa");

    @BeforeEach
    private void createLibrary() {
        library.getBooks().add(new Book("Title 1", "Author 1", LocalDate.now()));
        library.getBooks().add(new Book("Title 2", "Author 2", LocalDate.now()));
    }


    @Test
    void testShallowCopy() throws CloneNotSupportedException {
        //Given
        Library clonedLibrary = null;
        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Płytki Klon Koszykowa");
        //When
        library.getBooks().removeAll(library.getBooks());
        //Then
        assertEquals("Koszykowa", library.getName());
        assertEquals(0, clonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertEquals("Płytki Klon Koszykowa", clonedLibrary.getName());
        assertEquals(clonedLibrary.getBooks().hashCode(), library.getBooks().hashCode());
    }

    @Test
    void testDeepCloned() throws CloneNotSupportedException {
        //Given
        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Głęboki Klon Koszykowa");
        //When
        library.getBooks().removeAll(library.getBooks());
        //Then
        assertEquals(2, deepClonedLibrary.getBooks().size());
        assertEquals("Głęboki Klon Koszykowa", deepClonedLibrary.getName());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks().hashCode(), library.getBooks().hashCode());
    }
}
