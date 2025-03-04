package pl.gornik;

import pl.gornik.administration.Librarian;
import pl.gornik.administration.Library;
import pl.gornik.books.Book;
import pl.gornik.books.BookStatus;
import pl.gornik.books.Comic;
import pl.gornik.books.Magazine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian();
        Book book1 = new Book("Pan Tadeusz", "Adam Mickiewicz", 1839, 432, BookStatus.AVAILABLE);
        Book book2 = new Book("Dziady cz. 3", "Adam Mickiewicz", 1842, 109, BookStatus.BORROWED);
        Book book3 = new Book("Potop", "Henryk Sienkiewicz", 1610, 310, BookStatus.AVAILABLE);
        Magazine magazine1 = new Magazine("Object", "Jeff Jarvis", 2013, 68, BookStatus.LOST, "Bloomsbury Academic");
        Magazine magazine2 = new Magazine("MAS Magazine", "DJ Gemini", 2015, 112 , BookStatus.AVAILABLE, "Fantae ");
        Comic comic1 = new Comic("Wiedźmin. Ballada o dwóch wilkach", "Bartosz Sztybor", 2023, 112, BookStatus.AVAILABLE, "Egmont");
        Comic comic2 = new Comic("Latający smerf", "Maria Mosiewicz", 2021, 48, BookStatus.DESTROYED, "Egmont");
        librarian.addBook(book1);
        librarian.addBook(book2);
        librarian.addBook(book3);
        librarian.addBook(magazine1);
        librarian.addBook(magazine2);
        librarian.addBook(comic1);
        librarian.addBook(comic2);
        library.showAllBooks();
        List<Book> bookList = library.findBooksByAuthor("Adam Mickiewicz");
        for (Book book : bookList) book.presentBook();

    }
}