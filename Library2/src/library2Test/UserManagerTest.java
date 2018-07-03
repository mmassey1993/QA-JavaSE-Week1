package library2Test;

import library2.User;
import library2.UserManager;
import org.junit.Before;
import org.junit.Test;
import static library2.UserManager.users;


import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class UserManagerTest {

    private User user1;
    private ArrayList<User> users = new ArrayList<>();

    @Before
    public void setup(){
        user1 = new User(1,"name");
        users.add(user1);
    }

    @Test
    public void addUser(){
        assertEquals(true, users.size() != 0);
    }

    @Test
    public void deleteUser(){
        users.remove(0);
        assertEquals(true, users.size() == 0);
    }

    @Test
    public void updateUser(){
        for (User u : users){
            if (u.getID() == 1){
                u.setName("name2");
            }
        }
        assertEquals(true, user1.getName().equals("name2"));
    }
}
