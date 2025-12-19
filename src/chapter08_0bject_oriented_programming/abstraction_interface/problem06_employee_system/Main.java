package chapter08_0bject_oriented_programming.abstraction_interface.problem06_employee_system;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee employee = new FullTimeEmployee("Sujal", 50000);
        PartTimeEmployee employee1 = new PartTimeEmployee("Satyam", 60000);

        System.out.println("Name: "+employee.name+" Salary: "+employee.salary+" Bonus: "+employee.calculateBonus());
        System.out.println("Name: "+employee.name+" Salary: "+employee.salary+" Tax: "+employee.calculateTax());

        System.out.println("Name: "+employee1.name+" Salary: "+employee1.salary+" Bonus: "+employee1.calculateBonus());
        System.out.println("Name: "+employee1.name+" Salary: "+employee1.salary+" Tax: "+employee1.calculateTax());


    }
}
