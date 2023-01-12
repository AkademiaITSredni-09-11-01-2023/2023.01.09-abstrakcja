package pl.comarch.it.akademia.dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 5;
        dog.name = "Cos";

        Cat cat = new Cat();
        cat.age = 10;
        cat.name = "Cos2";

        Pet pet = new Cat();
        Pet pe2 = new Dog();

        cat.walk();

        dog.walk();

        Snake snake = new Snake();
        snake.walk();
    }
}
