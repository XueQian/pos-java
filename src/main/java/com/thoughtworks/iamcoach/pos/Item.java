package com.thoughtworks.iamcoach.pos;

public class Item {
    private String barcode;
    private String name;
    private double price;
    private String unit;

    public Item() {

    }

    public Item(String barcode, String name, double price, String unit) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
