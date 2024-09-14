import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Newspaper extends LibraryItem {
    private Date dateOfIssue;
    private List<String> mainHeadlines;

    public Newspaper(String title, Date dateOfIssue, List<String> mainHeadlines) {
        super(title);
        this.dateOfIssue = dateOfIssue;
        this.mainHeadlines = mainHeadlines;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getAuthors() {
        return new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Newspaper ===");
        System.out.println("Name: " + title);
        System.out.println("Date of Issue: " + dateOfIssue);
        System.out.println("Main Headlines:");
        for (String headline : mainHeadlines) {
            System.out.println("- " + headline);
        }
    }
}