package library.test;

import library.models.Book;
import library.models.Item;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTests {
    @Test
    public void createBook(){
        Item b = new Book(1, true, "Title", "Author");
    }

    @Test
    public void getAndSetIDAndStock(){
        Item b = new Book(1, true, "title", "author");
        assertEquals(1, b.getID());
        assertEquals(true, b.isInStock());
        b.setID(4);
        b.setInStock(false);
        assertEquals(4, b.getID());
        assertEquals(false, b.isInStock());
    }

    @Test
    public void getAndSet(){
        Book b = new Book(1, true, "title", "author");
        assertEquals(1, b.getID());
        assertEquals(true, b.isInStock());
        assertEquals("title", b.getTitle());
        assertEquals("author", b.getAuthor());
        b.setID(3);
        b.setInStock(false);
        b.setTitle("Title2");
        b.setAuthor("author2");
        assertEquals(3, b.getID());
        assertEquals(false, b.isInStock());
        assertEquals("Title2", b.getTitle());
        assertEquals("author2", b.getAuthor());
    }

}
