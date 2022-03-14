package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {

        System.out.println(getClass().getSimpleName() + " движется по трассе");
    }

    @Override
    public void passengers(String passengers) {
        System.out.println(getClass().getSimpleName() + " перевозит " + passengers + " пассажиров");
    }

    @Override
    public String fuel(String fuel) {
        System.out.println(getClass().getSimpleName() + " расходует " + fuel + " литров бензина");
        return null;
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.go();
        bus.passengers("сто тридцать");
        bus.fuel("тридцать");
    }
}
