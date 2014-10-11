package com.thoughtworks.iamcoach.pos;

public class Cart {
    private String barcode;
    private double count;

    public Cart(){

    }

    public Cart(String barcode,double count){
        this.barcode = barcode;
        this.count = count;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }
}
