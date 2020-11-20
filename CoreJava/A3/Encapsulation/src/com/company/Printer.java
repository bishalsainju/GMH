package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    private int inkLevel;
    private int numOfPagesPrinted;
    private int numOfPagesLeft;
    private boolean isDuplex;
    Queue<String> printingQueue = new LinkedList<>();

    public Printer(int inkLevel, int numOfPagesPrinted, int numOfPagesLeft, boolean isDuplex) {
        setInkLevel(inkLevel);
        setNumOfPagesPrinted(numOfPagesPrinted);
        setNumOfPagesLeft(numOfPagesLeft);
        this.isDuplex = isDuplex;
    }

    public void fillInk(int percentToFill) {
        if (percentToFill > 0 && percentToFill <= 100 ) {
            this.inkLevel = percentToFill;
        } else if (percentToFill > 100) {
            this.inkLevel = 100;
        }
    }

    public void setInkLevel(int inkLevel) {
        if (inkLevel > 0 && inkLevel <= 100) {
            this.inkLevel = inkLevel;
        } else if (inkLevel > 100) {
            this.inkLevel = 100;
        } else {
            this.inkLevel = 0;
        }
    }

    public int getInkLevel() {
        return this.inkLevel;
    }

    public void setNumOfPagesPrinted(int numOfPagesPrinted) {
        if (numOfPagesPrinted > 0) {
            this.numOfPagesPrinted = numOfPagesPrinted;
        } else {
            this.numOfPagesPrinted = 0;
        }
    }

    public int getNumOfPagesPrinted() {
        return this.getNumOfPagesPrinted();
    }

    public void setNumOfPagesLeft(int numOfPagesLeft) {
        if (numOfPagesLeft > 0) {
            this.numOfPagesLeft = numOfPagesLeft;
        } else {
            this.numOfPagesLeft = 0;
        }
    }

    public int getNumOfPagesLeft() {
        return this.numOfPagesLeft;
    }

    public void printPages(int numOfPages) {

        if (this.getNumOfPagesLeft() >= numOfPages) {
            this.setNumOfPagesPrinted(this.numOfPagesPrinted + numOfPages);
            this.setNumOfPagesLeft(this.numOfPagesPrinted - numOfPages);
            System.out.println("Printed " + numOfPages);
        } else {
            this.setNumOfPagesPrinted(this.numOfPagesPrinted + this.numOfPagesLeft);
            this.setNumOfPagesLeft(0);
            System.out.println("Printed " + this.numOfPagesLeft);
        }
    }

    public void addToQueue(String document) {
        this.printingQueue.add(document);
    }

    public void removeFromQueue(String document) {
        this.printingQueue.remove(document);
    }

}
