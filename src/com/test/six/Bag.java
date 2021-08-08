package com.test.six;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> list;
    private int weight;
    private List<List<Item>> listList = new ArrayList<>();

    public Bag(int weight) {
        this.weight = weight;
        list = new ArrayList<>();
    }
    public int getWeight() {
        return weight;
    }
    // заполняет сумку оптимальными предметами
    public void putInBag(List<Item> items) {
        recursion(items);
        List<Item> result = returnResult();
        for (Item item : result) {
            System.out.println(item);
            System.out.println("----------------------------------------------------------");
        }
        System.out.println("****************************************************************");
        System.out.println("Общий вес: " + totalWeight(result));
        System.out.printf("Общая стоимость: %f", totalCost(result));
    }
    private int totalWeight(List<Item> items) {
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).getWeight();
        }
        return total;
    }
    private double totalCost(List<Item> items) {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).getCost();
        }
        return total;
    }
    private void recursion(List<Item> list) {
        if (list.size() == 0) return;
        if (totalWeight(list) <= weight && !listList.contains(list)) {
            listList.add(list);
        }
        for (int i = 0; i < list.size(); i++) {
            List<Item> copy = new ArrayList<>();
            copy.addAll(list);
            copy.remove(i);
            recursion(copy);
        }
    }
    private List<Item> returnResult() {
        double total = 0;
        int index = 0;
        for (int i = 0; i < listList.size(); i++) {
            if (total < totalCost(listList.get(i))) {
                total = totalCost(listList.get(i));
                index = i;
            }
        }
        return listList.get(index);
    }
    @Override
    public String toString() {
        return "В сейфе находятся следующие предметы: ";
    }
}