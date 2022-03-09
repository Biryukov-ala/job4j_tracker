package ru.job4j.poly;

public class VehicleChar {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle truck = new Truck();

        Vehicle[] vehicles = new Vehicle[]{plane, truck, train};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
