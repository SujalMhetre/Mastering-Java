package chapter09_wrapper_classes.problem_01_autoboxing_unboxing;

public class WrapperAutoboxing {
    public static void main(String[] args) {

        // Declare a primitive int
        Integer myInt = 123;

        // Convert it into Integer (autoboxing)
        int autoInt = myInt;

        // Convert back to primitive (unboxing)
        Integer myInt1 = autoInt;


        // Print all values
        System.out.println(myInt);
        System.out.println(autoInt);
        System.out.println(myInt1);


    }
}
