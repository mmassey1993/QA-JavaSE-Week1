package library2Test;

import library2.*;
import org.junit.Before;
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
    private ArrayList<User> users;

    @Before
    public void setup(){
        user1 = new User(1,"name");
        b1 = new Book();
        n1 = new Newspaper();
        m1 = new Map();
        users = new ArrayList<>();
    }

    @Test
    public void addUser(){
        users.add(user1);
        assertTrue(users != null);
    }

    @Test
    public void deleteUser(){
        users.add(user1);
        assertEquals(true, users.size() != 0 );
        users.remove(0);
        assertEquals(true, users.size() == 0);
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
        assertTrue(user1.bookList.size() == 1);
    }

    @Test
    public void checkInItem(){
        user1.checkOutItem(b1);
        assertTrue(user1.bookList.size() == 1);
        //user1.booklist.remove(b1);
        user1.checkInItem(b1);
        assertTrue(user1.bookList.size() == 0);
    }
}
