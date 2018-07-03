package library2Test;

import library2.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class UserTest {

    private User user1;
    private Book b1;
    private Newspaper n1;
    private Map m1;


    @Before
    public void setup(){

        user1 = new User(1,"name");

        b1 = new Book(1, "title", "author");
        n1 = new Newspaper(2, "name");
        m1 = new Map(3, "region");

    }

    @Test
    public void getAndSetName(){
        assertEquals("name", user1.getName());
        user1.setName("name2");
        assertEquals("name2", user1.getName());
    }

    @Test
    public void checkoutItem(){
        user1.checkOutItem(b1);
        assertTrue(user1.itemList.size() == 1);
    }

    @Test
    public void checkInItem(){
        user1.checkOutItem(b1);
        assertTrue(user1.itemList.size() == 1);
        //user1.booklist.remove(b1);
        user1.checkInItem(b1);
        assertTrue(user1.itemList.size() == 0);
    }
}
