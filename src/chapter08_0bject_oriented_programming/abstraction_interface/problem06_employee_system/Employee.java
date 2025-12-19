package chapter08_0bject_oriented_programming.abstraction_interface.problem06_employee_system;

public abstract class Employee {
    String name;
    double salary;

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
   abstract double calculateBonus();

}
