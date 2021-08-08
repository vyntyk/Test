package com.test.six;

public class Main {
    public static void main(String[] args) {
        StorageItems storageItems = new StorageItems(new Item("колье", 15, 10.30),
                new Item("часы", 1, 30), new Item("акции", 1, 4.20),
                new Item("брошка", 2, 10.90), new Item("пистолет", 2, 110.10),
                new Item("кольцо", 2, 25.25), new Item("акции", 1, 5.0),
                new Item("слиток", 18, 75.60));

        Bag bag = new Bag(20);
        bag.putInBag(storageItems.ITEMS);
    }
}
