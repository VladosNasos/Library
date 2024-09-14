import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class LibraryItemFactory {
    public static LibraryItem createRandomLibraryItem() {
        Random random = new Random();
        int itemType = random.nextInt(3); // 0: Book, 1: Newspaper, 2: Almanac

        switch (itemType) {
            case 0: // Book
                String[] bookTitles = {"Random Book 1", "Random Book 2", "Random Book 3"};
                String[] authors = {"Author A", "Author B", "Author C"};
                String[] genres = {"Genre X", "Genre Y", "Genre Z"};
                String title = bookTitles[random.nextInt(bookTitles.length)];
                String author = authors[random.nextInt(authors.length)];
                String genre = genres[random.nextInt(genres.length)];
                int numberOfPages = random.nextInt(500) + 100;
                return new Book(title, author, genre, numberOfPages);

            case 1: // Newspaper
                String[] newspaperNames = {"Random Newspaper 1", "Random Newspaper 2"};
                String newspaperName = newspaperNames[random.nextInt(newspaperNames.length)];
                Date dateOfIssue = new Date();
                List<String> headlines = new ArrayList<>();
                headlines.add("Headline 1");
                headlines.add("Headline 2");
                return new Newspaper(newspaperName, dateOfIssue, headlines);

            case 2: // Almanac
                String[] almanacNames = {"Random Almanac 1", "Random Almanac 2"};
                String almanacName = almanacNames[random.nextInt(almanacNames.length)];
                List<Book> works = new ArrayList<>();
                // Adding random books
                works.add(new Book("Almanac Book 1", "Author D", "Genre Q", 150));
                works.add(new Book("Almanac Book 2", "Author E", "Genre R", 200));
                return new Almanac(almanacName, works);

            default:
                return null;
        }
    }
}