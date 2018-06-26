package com.company;

public class PaintJob {

   /* private int size;

    public PaintJob(int s){
        this.size = s;
    } */

    public void checkWastage(int size){
        int[] waste = new int[PaintManager.paintManagers.size()];
        for (PaintManager pm : PaintManager.paintManagers){
            int totalArea = pm.tinSize*pm.perLitre;
            waste.add(size % totalArea);

        }
    }
}
