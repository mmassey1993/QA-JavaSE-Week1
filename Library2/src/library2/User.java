package library2;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

public class User implements Listable{

    private int ID;
    private String name;
    public List<Book> bookList;
    public List<Map> mapList;
    public List<Newspaper> newspaperList;

    public User(int ID, String name) {
        this.ID = ID;
        this.name = name;
        bookList = new ArrayList<>();
        mapList = new ArrayList<>();
        newspaperList = new ArrayList<>();
        UserManager.users.add(this);
    }



    @Override
    public void checkOutItem(Book b) {
        bookList.add(b);
        //Remove from item list
    }

    @Override
    public void checkInItem(Book b) {
        bookList.remove(b);
        //Add to item list;
    }

    @Override
    public void checkInItem(Map m) {
        mapList.add(m);
        //Remove from item list
    }

    @Override
    public void checkOutItem(Map m) {
        mapList.remove(m);
        //Add to item list;
    }

    @Override
    public void checkInItem(Newspaper n) {
        newspaperList.add(n);
        //Remove from item list
    }

    @Override
    public void checkOutItem(Newspaper n) {
        newspaperList.remove(n);
        //Add to item list;
    }

    @Override
    public String toString(){
        return "This user has these books out: " + bookList + "This user has these maps out: " + mapList + "This user has these newspapers out: " + newspaperList;
    }

    public String getItemList(){
        return toString();
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


}
