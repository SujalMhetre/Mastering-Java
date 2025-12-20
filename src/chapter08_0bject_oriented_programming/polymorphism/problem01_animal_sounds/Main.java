package chapter08_0bject_oriented_programming.polymorphism.problem01_animal_sounds;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Tommy", 15);
        Animal cat = new Cat("Simba", 1);

        dog.makesound();
        cat.makesound();

        System.out.println(dog.name + " " + dog.age);
        System.out.println(cat.name + " " + cat.age);

    }
}
