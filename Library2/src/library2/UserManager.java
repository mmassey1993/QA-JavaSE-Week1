package library2;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements Editable{

    public static ArrayList<User> users = new ArrayList<>();

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


    public List<Item> checkOutItem(int personID, Item i) {
        //List<Item> temp;
        //iterate through users - find the id that matches first arg
        for(User u : users){
            if (u.getID() == personID){
                u.getItemList().add(i);
            }
        }

        for (Item i2 : i.getLibraryList())){
            if (i2.equals(i)){
                i2.setInStock(false);
            }
        }
        return u.getItemList();
    }

    @Override
    public List<Item> checkInItem(Item i) {
        itemList.remove(i);
        for (Item i2 : ItemManager.libraryList){
            if (i2.equals(i)){
                i2.setInStock(true);
            }
        }
        return itemList;
    }
}
