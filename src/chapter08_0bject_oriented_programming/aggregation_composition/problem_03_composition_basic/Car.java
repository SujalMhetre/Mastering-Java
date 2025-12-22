package chapter08_0bject_oriented_programming.aggregation_composition.problem_03_composition_basic;

public class Car {
    String name;
    String model;
    Engine engine;

    Car(String name, String model, String engineType, int horsepower) {
        this.name = name;
        this.model = model;
        this.engine = new Engine(engineType, horsepower);
    }

    void start() {
        engine.start();
        System.out.println("The car " + this.name + " " + this.model + " " + "has started");
    }
}
