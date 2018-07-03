package library2;

public class Library {

    private ItemManager im;
    private UserManager um;

    public Library(){
        im = new ItemManager();
        um = new UserManager();
    }

    public void checkOutItem(int personID, int itemID){



        um.checkOutItem(personID,itemID);

    }
}
