package pl.gornik.administration;
import static pl.gornik.administration.Library.*;

import pl.gornik.Reader;
import pl.gornik.books.Book;
import pl.gornik.books.BookStatus;
import pl.gornik.books.Comic;
import pl.gornik.books.Magazine;

import java.util.ArrayList;


public class Librarian {
    protected void addBook(String title, String author, int yearOfRelease, int pageCount, BookStatus bookStatus, String publisher, ArrayList bookList, String type) {
        if (type.equalsIgnoreCase("Książka")) bookList.add(new Book(title, author, yearOfRelease, pageCount, bookStatus));
        else if (type.equalsIgnoreCase("Magazyn")) bookList.add(new Magazine(title, author, yearOfRelease, pageCount, bookStatus, publisher));
        else if (type.equalsIgnoreCase("Komiks"))  bookList.add(new Comic(title, author, yearOfRelease, pageCount, bookStatus, publisher));
        else System.out.println("Wprowadzono niepoprawny typ książki.");
    }
    public void addBook(Book book) {
        bookList.add(book);
    }
    public static boolean removeBook(String title, String author) {
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author) && book.getTitle().equalsIgnoreCase(title)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
    public static boolean removeBook(Book book){
        return bookList.remove(book);
    }

    public boolean returnBook(String title, String author, int yearOfRelease, Reader reader){
        for (Borrow borrow : borrowHistory) {
            if (borrow.getBook().getAuthor().equalsIgnoreCase(author) &&
                    borrow.getBook().getTitle().equalsIgnoreCase(title) &&
                    borrow.getBook().getYearOfRelease() == yearOfRelease &&
                    borrow.getReader().equals(reader)){
                borrow.getBook().setBookStatus(BookStatus.AVAILABLE);
                return  true;
            }
        }
        return false;
    }
}
