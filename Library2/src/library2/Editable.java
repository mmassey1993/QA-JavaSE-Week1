package library2;

import java.util.ArrayList;

public interface Editable {

    ArrayList<User> deleteUser(int id);

    ArrayList<User> updateUser(int id, String name);
}
