package com.test.six;

public class Main {
    public static  void main(String[] args) {
        StorageItems storageItems = new StorageItems(new Item("сало",15,10.30),new Item("часы",1,30),
                new Item("компас",1,4.20),new Item("сапоги",2,10.90),new Item("ружьё",2,110.10),
                new Item("патроны",2,25.25),new Item("хлеб",1,5.0),new Item("бронежелет",18,75.60));

        Bag bag = new Bag(20);

        bag.putInBag(storageItems.ITEMS);
    }
}
