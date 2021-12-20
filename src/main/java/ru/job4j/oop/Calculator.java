package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int z) {
        return sum(10) + minus(8) + divide(45) + multiply(5);
    }

    public static void main(String[] args) {
        int sum = sum(10);
        int min = minus(8);
        System.out.println(sum);
        System.out.println(min);

        Calculator calculator = new Calculator();
        int mltp = calculator.multiply(5);
        int div = calculator.divide(45);
        int sumAll = calculator.sumAllOperation(1);
        System.out.println(mltp);
        System.out.println(div);
        System.out.println(sumAll);
    }
}
