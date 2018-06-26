package com.company;

import java.util.ArrayList;

public class PaintManager {

    public String name;
    public int tinSize;
    public float price;
    public int perLitre;
    static ArrayList<PaintManager> paintManagers = new ArrayList<>();

    public PaintManager(String name, int tinSize, float price, int perLitre){
        this.name = name;
        this.tinSize = tinSize;
        this.price = price;
        this.perLitre = perLitre;
        paintManagers.add(this);
    }
}
