package chapter08_0bject_oriented_programming.polymorphism.problem01_animal_sounds;

public abstract class Animal {

    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makesound();
}
