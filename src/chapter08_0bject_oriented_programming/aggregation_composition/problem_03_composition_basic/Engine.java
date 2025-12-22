package chapter08_0bject_oriented_programming.aggregation_composition.problem_03_composition_basic;

public class Engine {
    String enginetype;
    int horsepower;

    Engine(String enginetype, int horsepower) {
        this.enginetype = enginetype;
        this.horsepower = horsepower;
    }

    void start() {
        System.out.println("The engine" + " " + this.enginetype + " with horsepower-" + this.horsepower+" has started");
    }
}
