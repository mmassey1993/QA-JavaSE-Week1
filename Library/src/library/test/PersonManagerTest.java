package library.test;

import library.models.*;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class PersonManagerTest {

    @Test
    public void createPersonManager(){
        PersonManager pm = new PersonManager();
        assertNotNull(pm);
    }

    @Test
    public void addPerson(){
        PersonManager pm = new PersonManager();
        pm.add(new Person(1, "name"));
        assertEquals(1, pm.getList().size());
    }

    @Test
    public void updatePerson(){
        PersonManager pm = new PersonManager();
        pm.update(1, pm.add(new Person(1, "name2")));
        assertEquals("name2", pm.getName(0));
    }

    @Test
    public void removePerson(){
        PersonManager pm = new PersonManager();
        pm.remove(1);
        assertEquals(0, pm.getsize().size());

    }

    @Test
    public void checkOutItem(){

    }

    @Test
    public void returnItem(){

    }

    @Test
    public void isCorrectType(){
        PersonManager pm = new PersonManager();
        assertTrue(pm.isCorrectType(new Person(1, "name")));
        assertFalse(pm.isCorrectType(new Book(1, true, "title", "author")));
    }

    @Test
    public void isEmpty(){
        PersonManager pm = new PersonManager();
        assertTrue(true);
    }
}
