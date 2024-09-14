import java.util.ArrayList;
import java.util.List;

public class Almanac extends LibraryItem {
    private List<Book> works;

    public Almanac(String title, List<Book> works) {
        super(title);
        this.works = works;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getAuthors() {
        List<String> authors = new ArrayList<>();
        for (Book book : works) {
            authors.addAll(book.getAuthors());
        }
        return authors;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Almanac ===");
        System.out.println("Title: " + title);
        System.out.println("Contains Works:");
        for (Book book : works) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthors());
        }
    }
}