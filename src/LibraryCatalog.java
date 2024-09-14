import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LibraryCatalog {
    private List<LibraryItem> catalog;

    public LibraryCatalog() {
        catalog = new ArrayList<>();
    }

    // Test initialization
    public void initializeTestData() {
        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 218);
        Book book2 = new Book("1984", "George Orwell", "Dystopian", 328);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "Classic", 281);

        // Create newspaper
        List<String> headlines = new ArrayList<>();
        headlines.add("Election Results Announced");
        headlines.add("New Technology Innovations");
        Newspaper newspaper = new Newspaper("The Daily News", new Date(), headlines);

        // Create almanac
        List<Book> almanacWorks = new ArrayList<>();
        almanacWorks.add(book1);
        almanacWorks.add(book2);
        Almanac almanac = new Almanac("Classic Collection", almanacWorks);

        // Add items to catalog
        catalog.add(book1);
        catalog.add(book2);
        catalog.add(book3);
        catalog.add(newspaper);
        catalog.add(almanac);
    }

    // Add an object of specific type
    public void addItem(LibraryItem item) {
        catalog.add(item);
    }

    // Add an object of random type
    public void addRandomItem() {
        LibraryItem item = LibraryItemFactory.createRandomLibraryItem();
        catalog.add(item);
    }

    // Remove an object by title
    public void removeItemByTitle(String title) {
        Iterator<LibraryItem> iterator = catalog.iterator();
        while (iterator.hasNext()) {
            LibraryItem item = iterator.next();
            if (item.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Item with title '" + title + "' has been removed.");
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found.");
    }

    // Display the entire catalog
    public void displayCatalog() {
        for (LibraryItem item : catalog) {
            item.displayInfo();
            System.out.println();
        }
    }

    // Search by title (book or newspaper)
    public void searchByTitle(String title) {
        boolean found = false;
        for (LibraryItem item : catalog) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.displayInfo();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found with title '" + title + "'.");
        }
    }

    // Search by author
    public void searchByAuthor(String author) {
        boolean found = false;
        for (LibraryItem item : catalog) {
            List<String> authors = item.getAuthors();
            if (authors != null && authors.contains(author)) {
                item.displayInfo();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found by author '" + author + "'.");
        }
    }
}