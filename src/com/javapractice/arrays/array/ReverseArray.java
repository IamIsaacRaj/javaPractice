package com.javapractice.arrays.array;

public class ReverseArray {

    public static int[] reverseArray(int[] arr){
        if (arr == null) {
            return null;
        }
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length-1-i];
        }
        return newArray;
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] originalArray = {15, 24, 65, 100, 21};

        int[] reversedArray = reverseArray(originalArray);

        printArray(originalArray);
        printArray(reversedArray);
    }

}
