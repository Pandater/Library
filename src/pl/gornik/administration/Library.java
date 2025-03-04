package pl.gornik.administration;

import pl.gornik.Reader;
import pl.gornik.books.Book;
import pl.gornik.books.BookStatus;

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

    public void checkBorrowHistory(Reader reader){
        for (Borrow borrow : borrowHistory) {
            if (borrow.getReader().equals(reader)){
                System.out.println(" - ");
                borrow.presentBorrow();
            }
        }
    }

    public Book findBookByTitle (String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        return null;
    }
    public List<Book> findBooksByAuthor (String author){
        List<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) books.add(book);
        }
        return books;
    }

}
