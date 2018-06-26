package com.company;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class PaintJob {

   /* private int size;

    public PaintJob(int s){
        this.size = s;
    } */

    public static void checkWastage(int size){
        ArrayList<Integer> leastWaste = new ArrayList<>();
        int waste;
        for (PaintManager pm : PaintManager.paintManagers){
            int totalArea = pm.tinSize*pm.perLitre;
            waste = size % totalArea;
            leastWaste.add(waste);
        }
        int smallest = leastWaste.get(0);
        for (int x : leastWaste){
            if (x < smallest)
                smallest = x;
        }
        System.out.println("The least waste is " + smallest + " done by " + PaintManager.paintManagers);
    }
}
