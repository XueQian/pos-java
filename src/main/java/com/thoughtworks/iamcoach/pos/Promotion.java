package com.thoughtworks.iamcoach.pos;

public class Promotion {
    private String barcode;
    private double discount;

    public Promotion(String barcode){
        this.barcode = barcode;

    }

    public Promotion(String barcode,double discount){
        this.barcode = barcode;
        this.discount = discount;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getPrice() {
        return discount;
    }

    public void setPrice(double price) {
        this.discount = price;
    }
}
