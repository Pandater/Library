package pl.gornik.administration;

import pl.gornik.Reader;
import pl.gornik.books.Book;
import pl.gornik.books.BookStatus;
import pl.gornik.books.Comic;
import pl.gornik.books.Magazine;

import java.util.ArrayList;
import java.util.List;

public class Library {
    protected static List<Book> bookList;
    protected static List<Borrow> borrowHistory;

    public Library() {
        bookList = new ArrayList<>();
        borrowHistory = new ArrayList<>();
    }

    public void showAllBooks(){
        for (Book book : bookList) {
            System.out.print(" - ");
            book.presentBook();
        }
    }

    protected void addBook(String title, String author, int yearOfRelease, int pageCount, BookStatus bookStatus,  String publisher, ArrayList bookList, String type) {
        if (type.equalsIgnoreCase("Książka")) bookList.add(new Book(title, author, yearOfRelease, pageCount, bookStatus));
        else if (type.equalsIgnoreCase("Magazyn")) bookList.add(new Magazine(title, author, yearOfRelease, pageCount, bookStatus, publisher));
        else if (type.equalsIgnoreCase("Komiks"))  bookList.add(new Comic(title, author, yearOfRelease, pageCount, bookStatus, publisher));
        else System.out.println("Wprowadzono niepoprawny typ książki.");
    }
    protected static boolean removeBook(String title, String author) {
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author) && book.getTitle().equalsIgnoreCase(title)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
    protected static boolean removeBook(Book book){
        return bookList.remove(book);
    }

    public static Book findBookByTitle (String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        return null;
    }
    public static List<Book> findBooksByAuthor (String author){
        List<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) books.add(book);
        }
        return books;
    }
    public static void borrowBook (Book book, Reader reader) {
        new Borrow(book, reader);
    }
    public static boolean returnBook(String title, String author, int yearOfRelease){
        for (Borrow borrow : borrowHistory) {
            if (borrow.getBook().getAuthor().equalsIgnoreCase(author) &&
                borrow.getBook().getTitle().equalsIgnoreCase(title) &&
                borrow.getBook().getYearOfRelease() == yearOfRelease){
                return borrowHistory.remove(borrow);
            }
        }
        return false;
    }
}
