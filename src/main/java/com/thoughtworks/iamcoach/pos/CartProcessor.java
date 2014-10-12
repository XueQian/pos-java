package com.thoughtworks.iamcoach.pos;

import java.util.*;

public class CartProcessor extends FileProcessor {

    public List<Cart> process() {

        List<Cart> carts = new ArrayList<Cart>();
        List<String> cartList = readFile("cart.txt");

        for (String aCartList : cartList) {
            if (aCartList.length() > 10) {
                String stringBarcode = aCartList.split("-")[0];
                String stringCount = aCartList.substring(11);
                Cart cart = new Cart(stringBarcode, Double.parseDouble(stringCount));
                carts.add(cart);
            }
        }

        Set<String> uniqueBarcode = new HashSet<String>(cartList);
        for(String barcode : uniqueBarcode){
                Cart cart = new Cart(barcode,Collections.frequency(cartList,barcode));
                carts.add(cart);
            }
        return carts;
    }

}

