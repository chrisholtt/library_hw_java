import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Book book;
    Library library;

    @Before
    public void setUp(){
        book = new Book("Wrath of the balls", "Chris H", "Soft-core");
        library = new Library(4);
    }

    @Test
    public void canAddBookToLibraryStock(){
        library.add(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void doesntAddBookIfAtCapacity(){
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        assertEquals("Book cannot be added", library.add(book));
    }




}
