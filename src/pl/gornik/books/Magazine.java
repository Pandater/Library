package pl.gornik.books;

public class Magazine extends Book{
    private String publisher;

    public Magazine(String title, String author, int yearOfRelease, int pageCount, BookStatus bookStatus,String publisher) {
        super(title, author, yearOfRelease, pageCount, bookStatus);
        this.publisher = publisher;
    }
    @Override
    public void presentBook() {
        System.out.printf("Magazyn o tytule '%s' napisana przez %s Wydana w %d roku przez wydawnictwo %s. Ma %d stron. Status Magazynu - %s.\n", super.getTitle(), super.getAuthor(), super.getYearOfRelease(), publisher, super.getPageCount(), super.getBookStatus().getName());
    }
}
