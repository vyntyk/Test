package com.test.six;

import java.util.ArrayList;
import java.util.List;

public class StorageItems {
    public  final List<Item> ITEMS = new ArrayList<>();

    public StorageItems(Item...items) {
        for (Item item : items){
            ITEMS.add(item);
        }
    }
}
