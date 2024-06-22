package javaPractice.exercises.array;

public class MatrixAddition {

    public static int[][] matrixAddition(int[][] matrix1, int[][] matrix2) {

//  Check if the matrices have the same dimensions.
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices have different dimensions.Cannot perform Addition");
        }
//  Initialize the result matrix
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];

//  Perform matrix multiplication
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }
    // to print matrix
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
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrixB = {
                {12, 8, 6},
                {14, 45, 24}
        };

        int [][] addedMatrix = matrixAddition(matrixA,matrixB);

        printMatrix(matrixA);
        printMatrix(matrixB);
        printMatrix(addedMatrix);

    }
}
