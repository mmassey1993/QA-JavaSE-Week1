package library2Test;

import library2.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ItemTest {

    private Book b1;
    private Newspaper n1;
    private Map m1;
    private ArrayList<Item> itemList;
    private User user1;
    private ArrayList<User> users;


    @Before
    public void setup(){
        user1 = new User(1, "username");
        b1 = new Book(1, "title", "author");
        n1 = new Newspaper(2, "name");
        m1 = new Map(3, "region");
        itemList = new ArrayList<>();
        users = new ArrayList<>();
        users.add(user1);

        itemList.add(b1);
        itemList.add(n1);
        itemList.add(m1);
    }

    @Test
    public void addItem(){
        assertEquals(true, itemList.size() != 0);
    }

    @Test
    public void addItemToListFromUser(){
        user1.checkOutItem(b1);
        assertEquals(false, b1.isInStock());
    }

    @Test
    public void removeItemFromList(){
        itemList.remove(0);
        itemList.remove(0);
        itemList.remove(0);
        assertEquals(true, itemList.size() == 0);
        assertEquals(true, itemList.size() == 0);
        assertEquals(true, itemList.size() == 0);
    }

    @Test
    public void updateItemInList() {
        for (Item i : itemList) {
            if (i instanceof Book && i.getItemID() == Item.itemID) {
                ((Book) i).setTitle("title2");
                ((Book) i).setAuthor("author2");
            }
        }
        assertEquals(true, b1.getTitle().equals("title2"));
    }
}
