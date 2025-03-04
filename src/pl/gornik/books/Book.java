package pl.gornik.books;

public class Book {
    private String title;
    private String author;
    private int yearOfRelease;
    private int pageCount;
    private BookStatus bookStatus;

    public Book(String title, String author, int yearOfRelease, int pageCount, BookStatus bookStatus) {
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
        this.pageCount = pageCount;
        this.bookStatus = bookStatus;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getPageCount() {
        return pageCount;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public void presentBook() {
        System.out.printf("Książka o tytule '%s' napisana przez %s Wydana w %d roku. Ma %d stron. Status książki - %s.\n", title, author, yearOfRelease, pageCount, bookStatus.getName());
    }

}
