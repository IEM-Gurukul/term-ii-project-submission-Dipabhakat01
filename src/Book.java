package src;

public class Book extends LibraryItem {
    private String author;

    public Book(String id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public String getType() {
        return "Book (Author: " + author + ")";
    }
}
