package pl.gornik.books;

public enum BookStatus {
    BORROWED("Książka została wypożyczona", "Wypożyczona"),
    AVAILABLE("Książka dostępna do wypożyczenia", "Dostępna"),
    LOST("Książka została zagubiona", "Zagubiona"),
    DESTROYED("Książka została zniszcona", "Zniszczona");

    public String description;
    public String name;

    BookStatus(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
