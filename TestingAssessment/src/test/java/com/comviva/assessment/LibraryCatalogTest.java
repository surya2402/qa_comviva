package com.comviva.assessment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.comviva.assessment.book.Book;
import com.comviva.assessment.book.LibraryCatalog;

public class LibraryCatalogTest {

    private LibraryCatalog libraryCatalog;

    @Before
    public void setUp() {
        libraryCatalog = new LibraryCatalog();
    }

    @Test
    public void testAddBook() {
        // Test adding a book to the library catalog
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger");
        libraryCatalog.addBook(book);

        // Verify that the book is added successfully
        List<Book> books = libraryCatalog.getBooks();
        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }

    @Test
    public void testBorrowBook() {
        // Test borrowing a book from the library catalog
        Book availableBook = new Book("To Kill a Mockingbird", "Harper Lee");
        Book unavailableBook = new Book("1984", "George Orwell");
        libraryCatalog.addBook(availableBook);
        libraryCatalog.addBook(unavailableBook);

        // Borrow an available book and check its availability
        libraryCatalog.borrowBook("To Kill a Mockingbird");
        assertFalse(availableBook.isAvailable());

        // Borrow an unavailable book and check its availability
        assertTrue(unavailableBook.isAvailable());
    }

    @Test
    public void testReturnBook() {
        // Test returning a book to the library catalog
        Book availableBook = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book unavailableBook = new Book("Brave New World", "Aldous Huxley");
        libraryCatalog.addBook(availableBook);
        libraryCatalog.addBook(unavailableBook);

        // Return an unavailable book and check its availability
        libraryCatalog.returnBook("Brave New World");
        assertTrue(unavailableBook.isAvailable());
    }

    @Test
    public void testGetBooks() {
        // Test getting the list of books from the library catalog
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien");

        libraryCatalog.addBook(book1);
        libraryCatalog.addBook(book2);

        // Verify that the list of books is retrieved successfully
        List<Book> books = libraryCatalog.getBooks();
        assertEquals(2, books.size());
        assertTrue(books.contains(book1));
        assertTrue(books.contains(book2));
    }
}
