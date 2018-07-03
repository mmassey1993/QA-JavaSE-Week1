package library2;

import java.util.ArrayList;

public abstract class Item {

    private static int itemID;
    private boolean inStock;


    public Item(int itemID){
        this.itemID = itemID;
        inStock = true;
    }


    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }


    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
