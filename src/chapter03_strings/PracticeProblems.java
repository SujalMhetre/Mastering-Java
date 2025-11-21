package chapter03_strings;

public class PracticeProblems {
    public static void main(String[] args) {
        // Q1) Write a java program to convert a string to lowercase.

        String name = "SUJAL";

        name = name.toLowerCase();
        System.out.println(name);


        // Q2) Write a java program to replace spaces with underscores.

        String withSpaces = "Sujal Mhetre";

        withSpaces = withSpaces.replace(" ", "_");
        System.out.println(withSpaces);

        
        // Q3) Write a java program to fill in a letter template which looks like below
        // letter = "Dear <|name|>, Thanks a lot ";

        String name2 = "Dear <|name|> , Thanks a lot";

        name2 = name2.replace("<|name|>", "Sujal");
        System.out.println(name2);


        // Q4) Write a java program to detect double and triple spaces in a string

        String spaces = " This is a string with white spaces!!";

        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));


        // Q5) Write a program to format the following letter using escape sequence
        // characters.

        String letter = "Dear Sujal ,\n\tJava is very interesting\n\tThank you !!";
        System.out.println(letter);
    }
}
