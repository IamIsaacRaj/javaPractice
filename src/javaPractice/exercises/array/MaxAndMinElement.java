package javaPractice.exercises.array;

import java.util.Scanner;

public class MaxAndMinElement {

    public static void printArray(int[] arr){
        for (int values : arr) {
            System.out.print(values + " ");
        }
        System.out.println();
    }
    public static int maxElement(int[] arr){
        int maxValue = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if( arr[j] > maxValue)
                maxValue = arr[j];
        }
        return maxValue;
    }

    public static int minElement(int[] arr){
        int minValue = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if( arr[j] < minValue)
                minValue = arr[j];
        }
        return minValue;
    }

    public static void main(String[] args) {

//  1.find maximum amd minimum element in Array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];

        System.out.println("Enter the " + size + " elements:");
        for (int i = 0; i < size; i++) {
           arr1[i] = scanner.nextInt();
        }

        System.out.print("Array : ");
        printArray(arr1);

        int maxElement = maxElement(arr1);
        int minElement = minElement(arr1);

        System.out.println("maximum element = " + maxElement);
        System.out.println("minimum element = " + minElement);
    }

}
