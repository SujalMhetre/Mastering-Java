package chapter08_0bject_oriented_programming.inheritance.problem02_method_overriding;

public class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("The dog makes a sound *Woof-Woof* ");
        super.sound();
    }
}
