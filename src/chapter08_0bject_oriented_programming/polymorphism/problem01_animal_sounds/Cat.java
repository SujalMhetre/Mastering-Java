package chapter08_0bject_oriented_programming.polymorphism.problem01_animal_sounds;

public class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makesound() {
        System.out.println("The cat goes *Meow-Meow*");
    }
}
