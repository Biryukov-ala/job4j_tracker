package ru.job4j.poly;

public class Truck implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " движется по трассе");
    }
}