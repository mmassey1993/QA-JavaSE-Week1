package library.test;

import library.models.Book;
import library.models.Map;
import library.models.Newspaper;
import library.models.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class PersonTest {
    @Test
    public void addPerson(){
        Person p = new Person(1, "name");
        assertTrue(p != null);
    }

    @Test
    public void getAndSetName(){
        Person p = new Person(1, "name");
        assertEquals("name", p.getName());
        p.setName("name2");
        assertEquals("name2", p.getName());
    }

    @Test
    public void addItemFromListToPerson(){
        Person p = new Person(1, "abc");
        p.addItem(new Book(1, true, "Title", "Author"));
        p.addItem(new Newspaper(2, true, "Publisher", "Type"));
        p.addItem(new Map(3, true, "Region", "Type"));


    }

    @Test
    public void getItemList(){
        Person p = new Person(1, "abc");
        p.addItem(new Book(1, true, "Title", "Author"));
        p.addItem(new Newspaper(2, true, "Publisher", "Type"));
        p.getItemList();
    }

    @Test
    public void removeItemFromList(){
        Person p = new Person(1, "abc");
        p.addItem(new Book(1, true, "Title", "Author"));
        p.addItem(new Newspaper(2, true, "Publisher", "Type"));
        p.addItem(new Map(3, true, "Region", "Type"));
        p.removeItem(1);
        p.removeItem(2);
        p.removeItem(3);
    }

    @Test
    public void clearList() {
        Person p = new Person(1, "abc");
        p.addItem(new Book(1, true, "Title", "Author"));
        p.addItem(new Newspaper(2, true, "Publisher", "Type"));
        p.clearItemList();
    }
}
