package com.javapractice.arrays.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    // Function to remove duplicate elements from an unsorted array
    // This function returns a new array without duplicates
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        int[] temp = new int[arr.length];

//  size is initialized to 0, meaning temp array starts storing
//  unique from beginning of the array.
        int size = 0;

        for (int element : arr) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
                temp[size++] = element;
            }
        }

        // Creating the result array with the correct size
        int[] updatedArray = new int[size];
        System.arraycopy(temp, 0, updatedArray, 0, size);
        return updatedArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int[] updatedArray = removeDuplicates(arr);

        // Print updated array
        for (int element : updatedArray) {
            System.out.print(element + " ");
        }
    }
}
