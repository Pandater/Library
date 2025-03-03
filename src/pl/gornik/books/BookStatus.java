package pl.gornik.books;

public enum BookStatus {
    Borrowed("Książka została wypożyczona", "Wypożyczona"),
    Available("Książka dostępna do wypożyczenia", "Dostępna"),
    Lost("Książka została zagubiona", "Zagubiona"),
    Destroyed("Książka została zniszcona", "Zniszczona");

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
