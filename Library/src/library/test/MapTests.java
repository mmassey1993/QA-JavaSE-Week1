package library.test;

import library.models.Item;
import library.models.Map;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MapTests {
    @Test
    public void createMap(){
        Item m = new Map(1, true, "Region", "Type");
    }

    @Test
    public void getAndSetIDAndStock(){
        Item m = new Map(1, true, "Region", "Type");
        assertEquals(1, m.getID());
        assertEquals(true, m.isInStock());
        m.setID(4);
        m.setInStock(false);
        assertEquals(4, m.getID());
        assertEquals(false, m.isInStock());
    }

    @Test
    public void getAndSet(){
        Map m = new Map(1, true, "region", "type");
        assertEquals(1, m.getID());
        assertEquals(true, m.isInStock());
        assertEquals("region", m.getRegion());
        assertEquals("type", m.getType());
        m.setID(3);
        m.setInStock(false);
        m.setRegion("region2");
        m.setType("type2");
        assertEquals(3, m.getID());
        assertEquals(false, m.isInStock());
        assertEquals("region2", m.getRegion());
        assertEquals("type2", m.getType());
    }

}
