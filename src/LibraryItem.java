import java.util.List;

public abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract String getTitle();

    public abstract List<String> getAuthors();

    public abstract void displayInfo();
}