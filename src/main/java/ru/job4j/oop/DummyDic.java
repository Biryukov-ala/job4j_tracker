package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String eng = "morkovka";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic valera = new DummyDic();
        String eng = valera.engToRus();
        System.out.println("Неизвестное слово " + eng);
    }
}
