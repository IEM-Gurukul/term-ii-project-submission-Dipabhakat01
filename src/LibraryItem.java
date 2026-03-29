package src;

public abstract class LibraryItem {
    protected String id;
    protected String title;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
    }
    public abstract String getType();

    public String getId() { return id; }
    public String getTitle() { return title; }
}
