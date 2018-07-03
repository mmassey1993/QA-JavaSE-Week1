package library2;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

public class Newspaper extends Item {

    private String nameOfPaper;

    public Newspaper(int itemID, String nameOfPaper) {
        super(itemID);
        this.nameOfPaper = nameOfPaper;
    }

    public String getNameOfPaper() {
        return nameOfPaper;
    }

    public void setNameOfPaper(String nameOfPaper) {
        this.nameOfPaper = nameOfPaper;
    }
}
