package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PaintManager cheapoMax = new PaintManager("CheapoMax", 20, (float) 19.99, 10);
        PaintManager averageJoes = new PaintManager("Average Joes", 15, (float) 17.99, 11);
        PaintManager DuluxourousPaints = new PaintManager("DuluxourousPaints", 10, (float) 25.00, 20);

        //PaintJob myRoom = new PaintJob(30);
        PaintJob.checkWastage(30);
    }
}
