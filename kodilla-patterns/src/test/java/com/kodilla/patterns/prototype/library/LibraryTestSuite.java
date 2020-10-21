package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryTestSuite {

    Book addBook = new Book("Title 1", "Author 1", LocalDate.now());
    Book removeBook = new Book("Title 2", "Author 2", LocalDate.now());

    private Library createLibrary() {
        Library library = new Library("Koszykowa");
        library.getBooks().add(addBook);
        library.getBooks().add(removeBook);
        return library;
    }


    @Test
    void testShallowCopy() throws CloneNotSupportedException {
        //Given
        Library originalLibrary = createLibrary();
        //When
        Library clonedLibrary = originalLibrary.shallowCopy();
        clonedLibrary.setName("Płytki Klon Koszykowa");
        clonedLibrary.getBooks().remove(removeBook);
        //Then
        assertEquals("Koszykowa", originalLibrary.getName());
        assertEquals(1,originalLibrary.getBooks().size());
        assertEquals(1, clonedLibrary.getBooks().size());
        assertTrue(originalLibrary.getBooks().contains(addBook));
        assertTrue(clonedLibrary.getBooks().contains(addBook));
        assertEquals(clonedLibrary.getBooks(), originalLibrary.getBooks());
        assertEquals("Płytki Klon Koszykowa", clonedLibrary.getName());
        assertEquals(clonedLibrary.getBooks(), originalLibrary.getBooks());
    }

    @Test
    void testDeepCloned() throws CloneNotSupportedException {
        //Given
        Library originalLibrary = createLibrary();
        //When
        Library deepClonedLibrary = originalLibrary.deepCopy();
        deepClonedLibrary.setName("Głęboki Klon Koszykowa");
        deepClonedLibrary.getBooks().remove(removeBook);
        //Then
        assertEquals(2, originalLibrary.getBooks().size());
        assertTrue(originalLibrary.getBooks().contains(addBook));
        assertTrue(originalLibrary.getBooks().contains(removeBook));
        assertEquals(1, deepClonedLibrary.getBooks().size());
        assertTrue(deepClonedLibrary.getBooks().contains(addBook));
        assertEquals("Głęboki Klon Koszykowa", deepClonedLibrary.getName());
        assertNotEquals(deepClonedLibrary.getBooks(), originalLibrary.getBooks());
    }
}
