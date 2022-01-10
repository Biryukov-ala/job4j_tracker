package ru.job4j.tracker;

public class Item {
    private int id;

    private String name;

    public Item() {

    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Item(String name) {
        this.name = name;
    }

    public void printItem() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Item first = new Item("Alexandder", 2305);
        first.printItem();
        }
}