package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style, int pillows, int height, int sheets, int quilts){
        this.style = style;
        this.height = height;
        this.pillows = pillows;
        this.quilts  = quilts;
        this.sheets = sheets;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getHeight() {
        return height;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getSheets() {
        return sheets;
    }
}
