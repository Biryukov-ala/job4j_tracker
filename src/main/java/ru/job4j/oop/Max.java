package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
            return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int four) {
        return max(four, max(first, second, third));
    }
}
