package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void showFood() {
        System.out.println(this.food);
    }
    public void showName(){
        System.out.println(this.name);
        }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick){
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat x = new Cat();
        System.out.println("This is");
        x.giveNick("Barsik");
        x.showName();
        System.out.println("It's food is");
        x.eat("svinina");
        x.showFood();

        Cat gav = new Cat();
        System.out.println("There are gav's food.");
        gav.eat("kotleta");
        gav.showFood();

        Cat black = new Cat();
        System.out.println("There are black's food.");
        black.eat("fish");
        black.showFood();
    }
}
