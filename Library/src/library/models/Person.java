package library.models;

import java.util.ArrayList;
import java.util.List;

public class Person implements Crudable{
    private int ID;
    private String name;
    private List<Item> ItemList;

    public Person(int id, String name){
        this.ID = id;
        this.name = name;
        ItemList = new ArrayList<>();
    }


    public void setName(String newName) {
            name = newName;
    }


    public String getName() {
        return name;
    }


    public int getID() {
        return ID;
    }


    public void addItem(Item newItem) { // add to users item array
        ItemList.add(newItem);
        // flip boolean in item list to false (out of stock)
    }


    public List<Item> getItemList() {
        return ItemList;
    }


    public void removeItem(int ID) {
        int pos = 0;
        int found = -1;

        for(Item i : ItemList){
            if (ID == getID()){
                found = pos;
            }
            pos++;
        }
        if (found != -1){
            ItemList.remove(found);
        }
    }


    public void clearItemList() {
        ItemList.clear();
    }
}
