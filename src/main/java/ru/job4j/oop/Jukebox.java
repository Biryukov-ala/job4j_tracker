package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
       if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
           System.out.println("Песня не найдена");
       }
    }

    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        int song1 = 13;
        int song2 = 6;
        int song3 = 1;
        box.music(song1);
        box.music(song2);
        box.music(song3);

    }
}