package javaPractice.arrays;

public class Arrays {
    public static void main(String[] args) {
/*  An array is a container object that holds a fixed number of values of a
    similar type. The length of an array is established when the array is
    created and cannot be changed after that.

    Key Points:
    Fixed Size: Once an array is created, its size cannot be changed.
    Index-Based Access: Elements in the array can be accessed using their index,
                        starting from 0.
    Homogeneous Data: All elements in the array must be of the same type.
*/
//  Declaration
        int[] myArray;

//  Creating an Array Object;
        myArray = new int[5];
        System.out.println(myArray[4]);

//  Initializing the values to array
        myArray[0] = 10;
        myArray[1] = 15;
        myArray[2] = 23;
        myArray[3] = 5;
        myArray[4] = 90;
//  Elements are accessed via index, starting at 0.
        System.out.println("1st element in myArray = " + myArray[0]);
        System.out.println("length of myArray = " + myArray.length);

//  Shortcut to Initializing Arrays
//  You can initialize an array when you declare it, using an array initializer:

        byte[] myArray0 = {2, 4, 6, 8, 10};

//  looping through Arrays
//  1. basic for loop
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray[" + i + "] = " + myArray[i]);
        }
//  2. for-each loop
        for (int element : myArray0) {
            System.out.print(element + " ");
        }
        System.out.println();

//  3.while loop

        int i = 0;
        while (i < myArray.length) {
            System.out.println("myArray[" + i + "] = " + myArray[i]);
            i++;
        }
    }
}
