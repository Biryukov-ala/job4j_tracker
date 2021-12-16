package ru.job4j.oop;

public class Ball {

    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден");
        } else {
            System.out.println("Я от бабушки ушёл, я от дедушки ушёл "
                    + "и от тебя, чудище мохнатое, я тоже ушёл");
        }
    }
}
