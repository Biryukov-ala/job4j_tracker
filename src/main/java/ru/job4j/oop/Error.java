package ru.job4j.oop;

public class Error {
    private boolean active;

    private int status;

    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Счет в банке открыт: " + active);
        System.out.println("Остаток средств на счете: " + status + " руб.");
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 0, "Недостаточно средств");
        Error second = new Error();
        error.printInfo();
    }
}
