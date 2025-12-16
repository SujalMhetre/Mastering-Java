package Chapter07_array;

public class PracticeProblems_1D_Arrays {
    public static void main(String[] args) {
        // 1) Sum of all elements
        int[] elements = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < elements.length; i++) {
            sum = sum + elements[i];
        }
        System.out.println("Sum of all elements is :" + sum);

        // 2) Sum of even numbers only
        int sumEven = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0) {
                sumEven = sumEven + elements[i];
            }
        }
        System.out.println("Sum of all even elements from the array is :" + sumEven);

        // 3)Sum of odd numbers only
        int sumOdd = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 != 0) {
                sumOdd = sumOdd + elements[i];
            }
        }
        System.out.println("Sum of all odd numbers from the array is :" + sumOdd);

        // 4) Sum of positive and negative separately
        int[] numbers = {1, -3, 5, 7, -10, -5};
        int sumOfPosi = 0;
        int sumOfNegi = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sumOfNegi = sumOfNegi + numbers[i];
            } else {
                sumOfPosi = sumOfPosi + numbers[i];
            }
        }
        System.out.println("Sum of all postitive numbers from the array is :" + sumOfPosi);
        System.out.println("Sum of all negative numbers form the array is :" + sumOfNegi);

        // 5) Sum of elements at even index
        int sumEvenIndex = 0;
        for (int i = 0; i < elements.length; i += 2) {
            sumEvenIndex += elements[i];
        }
        System.out.println("Sum of elements at even index are:" + sumEvenIndex);

        // 6) Sum of elements greater than a given number X
        int x = 2;
        int sumOfNGX = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > x) {
                sumOfNGX += elements[i];
            }
        }
        System.out.println("Sum of elements greater than the given X is:" + sumOfNGX);

        // 7) Total Length of All Strings
        String[] words = {"java", "is", "fun"};
        int lengthOfStr = 0;

        for (int i = 0; i < words.length; i++) {
            lengthOfStr += words[i].length();
        }
        System.out.println("Total length of the string is:" + lengthOfStr);

        // 8) Sum of digits inside a string
        String str = "a1b2c3";
        int digit = 0;
        int sumOfDStr = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digit = ch - '0';
                sumOfDStr += digit;
            }
        }
        System.out.println("Sum of digits inside a string is :" + sumOfDStr);

        // 9) Count Total Vowels in a String Array
        int totalVowels = 0;

        String[] animals = {"cat", "cow", "dog", "tiger"};

        for (int i = 0; i < animals.length; i++) {
            String animal = animals[i];
            for (int j = 0; j < animal.length(); j++) {
                char vowel = animal.charAt(j);
                if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                    totalVowels++;
                }
            }
        }
        System.out.println("Total count of vowels in the array is :" + totalVowels);

    }
}
