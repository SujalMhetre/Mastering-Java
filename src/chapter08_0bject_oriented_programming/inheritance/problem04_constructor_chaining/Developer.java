package chapter08_0bject_oriented_programming.inheritance.problem04_constructor_chaining;

public class Developer extends Employee {

    Developer(int employeeId){
        super(employeeId);
        System.out.println("Developer contructor is called");
    }


}
