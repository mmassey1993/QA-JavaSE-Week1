package library2;

import java.util.ArrayList;

public class Book extends Item {

    private String title;
    private String author;



    public Book(int itemID, String title, String author){
        super(itemID);
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
