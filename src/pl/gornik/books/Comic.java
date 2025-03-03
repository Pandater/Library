package pl.gornik.books;

public class Comic extends Book{
    private String publisher;

    public Comic(String title, String author, int yearOfRelease, int pageCount, BookStatus bookStatus, String publisher) {
        super(title, author, yearOfRelease, pageCount, bookStatus);
        this.publisher = publisher;
    }
    @Override
    public void presentBook() {
        System.out.printf("Komiks o tytule '%s' napisana przez %s Wydana w %d roku przez wydawnictwo %s. Ma %d stron. Status Komiksu - %s", super.getTitle(), super.getAuthor(), super.getYearOfRelease(), publisher, super.getPageCount(), super.getBookStatus().getName());
    }
}
