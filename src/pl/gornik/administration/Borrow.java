package pl.gornik.administration;

import pl.gornik.Reader;
import pl.gornik.books.Book;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Borrow {
    private Book book;
    private Reader reader;
    private LocalDateTime borrowDate;

    private String returnDate;

    public Borrow(Book book, Reader reader) {
        this.book = book;
        this.reader = reader;
        this.returnDate = "30-04-2025";
        this.borrowDate = LocalDateTime.now();
    }

    private final DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    private final String formattedBorrowDate = borrowDate.format(myFormatObj);

    public Book getBook() {
        return book;
    }

    public Reader getReader() {
        return reader;
    }

    public void presentBorrow (){
        System.out.printf("Książka o tytule '%s' wypożyczona %s. Data zwrotu to: %s", book.getAuthor(), borrowDate, returnDate);
    }
}
