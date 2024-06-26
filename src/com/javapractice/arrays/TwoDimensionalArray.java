package com.javapractice.arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // Declaration and creation of a 2D array
        int[][] twoDArray = new int[3][3];

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int element = matrix[1][2]; // 6
        System.out.println(element);

        // Print 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
