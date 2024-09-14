public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        // Test initialization
        catalog.initializeTestData();

        // Display the catalog
        System.out.println("Initial Catalog:");
        catalog.displayCatalog();

        // Add a specific item
        Book newBook = new Book("New Book", "New Author", "New Genre", 123);
        catalog.addItem(newBook);
        System.out.println("After adding a new book:");
        catalog.displayCatalog();

        // Add a random item
        catalog.addRandomItem();
        System.out.println("After adding a random item:");
        catalog.displayCatalog();

        // Remove an item by title
        catalog.removeItemByTitle("1984");
        System.out.println("After removing '1984':");
        catalog.displayCatalog();

        // Search by title
        System.out.println("Search for 'The Great Gatsby':");
        catalog.searchByTitle("The Great Gatsby");

        // Search by author
        System.out.println("Search for author 'George Orwell':");
        catalog.searchByAuthor("George Orwell");
    }
}