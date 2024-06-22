package javaPractice.exercises.array;

public class MatrixMultiplication {
    
    public static int[][] matrixMultiplication(int[][] matrix1,int[][] matrix2){
//  Check if matrices can be multiplied
//  the number of columns in the first matrix must be equal
//  to the number of rows in the second matrix

        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices cannot be multiplied due to incompatible dimention");
        }
        // Initialize the result matrix
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];

        // Perform matrix multiplication
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }
    public static void  printMatrix(int[][] matrix){
        System.out.println("Matrix Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrixA = {
                {10, 6, 2},
                {1, 5, 9}
        };
        int[][] matrixB = {
                {2, 8},
                {9, 12},
                {10, 23}
        };

        int[][] multipliedMatrix = matrixMultiplication(matrixA,matrixB);

        printMatrix(matrixA);
        printMatrix(matrixB);
        printMatrix(multipliedMatrix);
    }
}
