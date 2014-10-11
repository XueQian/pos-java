package com.thoughtworks.iamcoach.pos;

public class Promotion {
    private String barcode;
    private double price;

    public Promotion(){

    }

    public Promotion(String barcode,double price){
        this.barcode = barcode;
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
