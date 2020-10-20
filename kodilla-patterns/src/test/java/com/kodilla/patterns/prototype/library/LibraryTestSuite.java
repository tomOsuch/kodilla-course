package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryTestSuite {

    private Library createLibrary() {
        Library library = new Library("Koszykowa");
        library.getBooks().add(new Book("Title 1", "Author 1", LocalDate.now()));
        library.getBooks().add(new Book("Title 2", "Author 2", LocalDate.now()));
        return library;
    }


    @Test
    void testShallowCopy() throws CloneNotSupportedException {
        //Given
        Library originalLibrary = createLibrary();
        //When
        Library clonedLibrary = originalLibrary.shallowCopy();
        clonedLibrary.setName("Płytki Klon Koszykowa");
        clonedLibrary.getBooks().remove(clonedLibrary.getBooks().iterator().next());
        //Then
        assertEquals("Koszykowa", originalLibrary.getName());
        assertEquals(1,originalLibrary.getBooks().size());
        assertEquals(1, clonedLibrary.getBooks().size());
        assertEquals("Title 1", originalLibrary.getBooks().iterator().next().getTitle());
        assertEquals("Title 1", clonedLibrary.getBooks().iterator().next().getTitle());
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
        deepClonedLibrary.getBooks().remove(deepClonedLibrary.getBooks().iterator().next());
        //Then
        assertEquals(2, originalLibrary.getBooks().size());
        assertEquals(1, deepClonedLibrary.getBooks().size());
        assertEquals("Title 1",deepClonedLibrary.getBooks().iterator().next().getTitle());
        assertEquals("Głęboki Klon Koszykowa", deepClonedLibrary.getName());
        assertNotEquals(deepClonedLibrary.getBooks(), originalLibrary.getBooks());
    }
}
