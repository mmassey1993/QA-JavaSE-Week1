package library.models;

public abstract class Item implements Crudable{
    private int ID;
    private boolean inStock;

    public Item(int id, boolean instock){
        this.ID = id;
        this.inStock = instock;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

}
