package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library = new Library();

    @Test
    public void getAvailableBookListShouldReturnHarrypotter() throws Exception {
        assertTrue(library.getAvailableBookList().containsKey("Harry Potter"));
    }

    @Test
    public void getAvailableBookListShouldntReturnDaVinciCode() throws Exception {
        assertFalse(library.getAvailableBookList().containsKey("Da Vinci Code"));
    }

    @Test
    public void checkoutBookShouldMakeAvailabilityFalse() throws Exception {
        Book book = new Book("Lord of the Rings","JR Tolkien", 2000, true);
        library.checkoutBook(book);

        assertEquals(book.available, false);
    }

    @Test
    public void returnBookShouldMakeAvailabilityTrue() throws Exception {
        Book book = new Book("Lord of the Rings","JR Tolkien", 2000, false);
        library.returnBook(book);

        assertEquals(book.available, true);
    }

}