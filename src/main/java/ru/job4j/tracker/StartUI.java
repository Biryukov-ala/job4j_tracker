package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime created = item.getCreated();
        System.out.println("Текущие дата и время до форматирования: " + created);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String created1 = created.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + created1);
    }
}
