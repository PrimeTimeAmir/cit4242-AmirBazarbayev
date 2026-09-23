import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookSourceTest {

    @Test
    void inMemorySourceReturnsThreeBooks() {
        BookSource source = new InMemoryBookSource();

        List<Book> books = source.load();

        assertEquals(3, books.size());
    }
}