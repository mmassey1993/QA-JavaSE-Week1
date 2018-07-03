package library2;

import java.util.ArrayList;

public class User{

    private int ID;
    private String name;
    private ArrayList<Item> itemList;

    public User(int ID, String name) {
        this.ID = ID;
        this.name = name;
        setItemList(new ArrayList<>());
        UserManager.users.add(this);
    }

//    @Override
//    public String toString(){
//        return "This user has the following items out: " + getItemList();
//    }

    public ArrayList<Item> getItemList(){
        return itemList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
}
