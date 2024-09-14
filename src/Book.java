import java.util.ArrayList;
import java.util.List;

public class Book extends LibraryItem {
    private String author;
    private String genre;
    private int numberOfPages;

    public Book(String title, String author, String genre, int numberOfPages) {
        super(title);
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getAuthors() {
        List<String> authors = new ArrayList<>();
        authors.add(author);
        return authors;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Book ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Pages: " + numberOfPages);
    }
}