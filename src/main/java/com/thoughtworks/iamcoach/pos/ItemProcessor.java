package com.thoughtworks.iamcoach.pos;

import java.util.ArrayList;
import java.util.List;

public class ItemProcessor {
    public List<Item> process() {
        FileProcessor fileProcessor = new FileProcessor();
        List<Item> items = new ArrayList<Item>();
        List<String> itemList = fileProcessor.readFile("items.txt");

        for (String aItemList : itemList) {
            String[] stringItem = aItemList.split(",");
            Item item = new Item(stringItem[0], stringItem[1], Double.parseDouble(stringItem[2]), stringItem[3]);
            items.add(item);

        }
        return items;
    }

}

