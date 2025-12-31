package chapter07_arrays;

import java.util.Scanner;

public class PracticeProblems_2D_Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1) Input & Print a Matrix
        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 elements for 3x3 matrix:");

        //  Input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix is :");

        // Output
        for (int[] rows : matrix) {
            for (int cols : rows) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        // 2) Count Even & Odd Numbers
        System.out.println("Enter your rows value:");
        int r = scanner.nextInt();
        System.out.println("Enter your column value:");
        int c = scanner.nextInt();

        int[][] matrix1 = new int[r][c];

        System.out.println("Enter elements for your matrix:");
        //Input
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        int countEven = 0;
        int countOdd = 0;

        for (int[] row : matrix1) {
            for (int col : row) {
                if (col % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        }

        System.out.println("Total number of even numbers in matrix is:" + countEven);
        System.out.println("Total number of odd numbers in matrix is:" + countOdd);

        // 3) Find Maximum & Minimum in a 2D Array

        System.out.println("Enter row count:");
        int r1 = scanner.nextInt();

        System.out.println("Enter column count:");
        int c1 = scanner.nextInt();

        int[][] matrix2 = new int[r1][c1];
        System.out.println("Enter your matrix elements:");

        // Input
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("");
        // Output
        int max = matrix2[0][0];
        int min = matrix2[0][0];

        for (int[] row : matrix2) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
                if (col < min) {
                    min = col;
                }
            }
        }
        System.out.println("Max number is:" + max);
        System.out.println("Min number is:" + min);

        // 4) Row-wise Sum of a 2D Matrix
        System.out.println("Enter row count:");
        int r2 = scanner.nextInt();

        System.out.println("Enter column count:");
        int c2 = scanner.nextInt();

        int[][] matrix3 = new int[r2][c2];
        System.out.println("Enter your matrix elements:");

        // Input
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                matrix3[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        // Row wise sum
        for (int i = 0; i < matrix3.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix3[i].length; j++) {
                sum += matrix3[i][j];
            }
            System.out.println("Row " + i + " Sum = " + sum);
        }

        // Column wise sum
        for (int j = 0; j < c2; j++) {
            int sum = 0;
            for (int i = 0; i < r2; i++) {
                sum += matrix3[i][j];
            }
            System.out.println("Col " + j + "Sum = " + sum);
        }

        scanner.close();
    }
}
