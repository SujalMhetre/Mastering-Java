package variables;

import java.util.Scanner;

public class InputTypes {
    static void main(String[] args) {
        int age;
        float height;
        char gender;

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your Age :");
         age = sc.nextInt();

        System.out.println("Enter your Height :");
        height=sc.nextFloat();

        System.out.println("Enter your Gender 'M' for Male and 'F' for Female :");
        gender = sc.next().charAt(0);

        System.out.println("--------Output-------");

        System.out.println("Age :"+age);
        System.out.println("Height :"+height);
        System.out.println("Gender :"+gender);
    }
}
