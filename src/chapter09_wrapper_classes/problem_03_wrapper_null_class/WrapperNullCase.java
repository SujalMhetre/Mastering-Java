package chapter09_wrapper_classes.problem_03_wrapper_null_class;

public class WrapperNullCase {
    public static void main(String[] args) {

        Integer myInt1 = null;

        System.out.println(myInt1 + 10);


        // this will throw a null pointer exception
        // Integer (wrapper class)  can be null
        // int cannot be null it must have a value ( integer )

        // this is a runtime error not compile time
        // at runtime java will see x + 10 ; so Java tries to extract an int value from the Integer object, but the reference points to null, so there is no object to unbox, which causes NullPointerException
    }
}
