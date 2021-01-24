package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author_test1", "Title1", 1991, "abcd"));
        bookSet.add(new Book("Author_test2", "Title2", 1998, "abce"));
        bookSet.add(new Book("Author_test3", "Title3", 2010, "abcf"));
        //When
        MedianAdapter adapter = new MedianAdapter();
        int medianPublicationYear = adapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1998, medianPublicationYear);
    }
}
