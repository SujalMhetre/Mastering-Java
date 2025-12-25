package chapter09_wrapper_classes.problem_02_wrapper_comparison;

public class Wrappercomparison {
    public static void main(String[] args) {

        Integer myInt = 200;
        Integer myInt1 = 200;

        System.out.println(myInt == myInt1); // this is false because it is beyond the range of integers cache (-127, 127)

        System.out.println(myInt.equals(myInt1)); //  this directly compares with the value at both variales
    }
}
