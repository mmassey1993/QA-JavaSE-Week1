package library.test;

import library.models.Item;
import library.models.Newspaper;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NewspaperTests {
    @Test
    public void createNewspaper(){
        Item n = new Newspaper(1, true, "Publisher", "Type");
    }

    @Test
    public void getAndSetIDAndStock(){
        Item n = new Newspaper(1, true, "publisher", "type");
        assertEquals(1, n.getID());
        assertEquals(true, n.isInStock());
        n.setID(4);
        n.setInStock(false);
        assertEquals(4, n.getID());
        assertEquals(false, n.isInStock());
    }

    @Test
    public void getAndSet(){
        Newspaper n = new Newspaper(1, true, "publisher", "type");
        assertEquals(1, n.getID());
        assertEquals(true, n.isInStock());
        assertEquals("publisher", n.getPublisher());
        assertEquals("type", n.getType());
        n.setID(3);
        n.setInStock(false);
        n.setPublisher("publisher2");
        n.setType("type2");
        assertEquals(3, n.getID());
        assertEquals(false, n.isInStock());
        assertEquals("publisher2", n.getPublisher());
        assertEquals("type2", n.getType());
    }

}
