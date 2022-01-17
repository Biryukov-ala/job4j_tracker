package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book detective = new Book("Holmes", 11);
        Book comedy = new Book("Karter", 3);
        Book horror = new Book("Krugger", 6);
        Book programming = new Book("Clean code", 1);
        Book[] books = new Book[4];
        books[0] = detective;
        books[1] = comedy;
        books[2] = horror;
        books[3] = programming;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("Replace detective to programming.");
        Book prog = new Book("Clean code", 1);
        Book detect = new Book("Holmes", 11);
        books[0] = prog;
        books[3] = detect;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }

        System.out.println("Shown only product.named 'Clean code'");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}
