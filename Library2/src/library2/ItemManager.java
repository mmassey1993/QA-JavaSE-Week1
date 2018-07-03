package library2;

import java.util.ArrayList;

public class ItemManager {

    private ArrayList<Item> libraryList = new ArrayList<>();



    public ArrayList<Item> getLibraryList() {
        return libraryList;
    }



    public void setLibraryList(ArrayList<Item> libraryList) {
        this.libraryList = libraryList;
    }



    public ArrayList<Item> addItem(Item i){
        libraryList.add(i);
        return libraryList;
    }



    public ArrayList<Item> removeItem(int itemID) {
        libraryList.remove(itemID);
        return libraryList;
    }



    public ArrayList<Item> updateBook(int itemID, String title, String author) {
        for (Item i : libraryList){
            if (i instanceof Book && i.getItemID() == itemID){
                ((Book) i).setTitle(title);
                ((Book) i).setAuthor(author);
            }
        }
        return libraryList;
    }



    public ArrayList<Item> updateNewspaper(int itemID, String nameOfPaper) {
        for (Item i : libraryList){
            if (i instanceof Book && i.getItemID() == itemID){
                ((Newspaper) i).setNameOfPaper(nameOfPaper);
            }
        }
        return libraryList;
    }

    public ArrayList<Item> updateMap(int itemID, String region) {
        for (Item i : libraryList){
            if (i instanceof Map && i.getItemID() == itemID){
                ((Map) i).setRegion(region);
            }
        }
        return libraryList;
    }




}
