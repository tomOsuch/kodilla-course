package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryTestSuite {

    private final Book book = new Book("Title 1", "Author 1", LocalDate.now());
    private final Book bookToRemove = new Book("Title 2", "Author 2", LocalDate.now());

    private Library createLibrary() {
        Library library = new Library("Koszykowa");
        library.getBooks().add(book);
        library.getBooks().add(bookToRemove);
        return library;
    }


    @Test
    void testShallowCopy() throws CloneNotSupportedException {
        //Given
        Library originalLibrary = createLibrary();
        //When
        Library clonedLibrary = originalLibrary.shallowCopy();
        clonedLibrary.setName("Płytki Klon Koszykowa");
        clonedLibrary.getBooks().remove(bookToRemove);
        //Then
        assertEquals("Koszykowa", originalLibrary.getName());
        assertEquals(1,originalLibrary.getBooks().size());
        assertEquals(1, clonedLibrary.getBooks().size());
        assertTrue(originalLibrary.getBooks().contains(book));
        assertTrue(clonedLibrary.getBooks().contains(book));
        assertEquals("Płytki Klon Koszykowa", clonedLibrary.getName());
    }

    @Test
    void testDeepCloned() throws CloneNotSupportedException {
        //Given
        Library originalLibrary = createLibrary();
        //When
        Library deepClonedLibrary = originalLibrary.deepCopy();
        deepClonedLibrary.setName("Głęboki Klon Koszykowa");
        deepClonedLibrary.getBooks().remove(bookToRemove);
        //Then
        assertEquals(2, originalLibrary.getBooks().size());
        assertTrue(originalLibrary.getBooks().contains(book));
        assertTrue(originalLibrary.getBooks().contains(bookToRemove));
        assertEquals(1, deepClonedLibrary.getBooks().size());
        assertTrue(deepClonedLibrary.getBooks().contains(book));
        assertEquals("Głęboki Klon Koszykowa", deepClonedLibrary.getName());
    }
}
