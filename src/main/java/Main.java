import java.util.List;

class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " - " + author;
    }
}

interface BookSource {
    List<Book> load();
}

class InMemoryBookSource implements BookSource {

    @Override
    public List<Book> load() {
        return List.of(
                new Book("Book 1", "Author 1"),
                new Book("Book 2", "Author 2"),
                new Book("Book 3", "Author 3")
        );
    }
}

class CsvBookSource implements BookSource {

    private final String resource;

    public CsvBookSource(String resource) {
        this.resource = resource;
    }

    @Override
    public List<Book> load() {
        return List.of();
    }
}

public class Main {

    public static void main(String[] args) {
        BookSource source = new InMemoryBookSource();
        List<Book> books = source.load();

        for (Book book : books) {
            System.out.println(book);
        }
    }
}