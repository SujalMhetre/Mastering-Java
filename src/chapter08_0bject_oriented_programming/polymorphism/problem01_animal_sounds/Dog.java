package chapter08_0bject_oriented_programming.polymorphism.problem01_animal_sounds;

public class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makesound() {
        System.out.println("The dog goes *Woof-Woof*");
    }
}
