package com.thoughtworks.iamcoach.pos;

public class CartItem {
    private Item item;
    private double count;

    public CartItem(Item item, double count) {
        this.item = item;
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public double getCount() {
        return count;
    }

}
