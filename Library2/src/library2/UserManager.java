package library2;

import java.util.ArrayList;

public class UserManager implements Editable{

    public static ArrayList<User> users;

    @Override
    public ArrayList<User> deleteUser(int id) {
        users.remove(id);
        return users;
    }

    @Override
    public ArrayList<User> updateUser(int id, String name) {

        for (User u : users){
            if (u.getID() == id){
                u.setName(name);
            }
        } return users;
    }

}
