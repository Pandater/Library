package pl.gornik;

import pl.gornik.administration.Borrow;
import pl.gornik.books.Book;
import pl.gornik.books.BookStatus;

public class Reader {
    private String name;
    private String surname;
    private int age;

    public Reader(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static boolean borrowBook (Book book, Reader reader) {
        if (book.getBookStatus().equals(BookStatus.AVAILABLE)) {
            new Borrow(book, reader);
            book.setBookStatus(BookStatus.BORROWED);
            return true;
        } else return false;
    }
}
