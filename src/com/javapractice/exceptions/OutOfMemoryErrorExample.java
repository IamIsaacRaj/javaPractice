package com.javapractice.exceptions;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    /*
     Each iteration of the loop creates a new array of 1,000,000 integers.
     Since an integer in Java typically takes up 4 bytes, each array consumes
      approximately 4 MB of memory.The ArrayList keeps references to
      these arrays, so they cannot be garbage collected.
    */
    public static void main(String[] args) {
        try{
            List<int[]> list = new ArrayList<>();
            while (true){
                list.add(new int[100000]);
                /*
                 Each iteration of the loop creates a new array of 1,000,000 integers.
                 Since an integer in Java typically takes up 4 bytes, each array consumes
                  approximately 4 MB of memory.The ArrayList keeps references to
                  these arrays, so they cannot be garbage collected.
                  The JVM allocates a limited amount of heap memory for storing objects.
                  As the loop continues, more and more memory is allocated
                  until the heap space is exhausted.
                */
            }
        }catch (OutOfMemoryError e){
            System.out.println("OutOfMemoryError caught: " + e.getMessage());
            /* Once the JVM runs out of heap memory, it throws an OutOfMemoryError.
               This error indicates that the JVM cannot allocate more memory
               to fulfill the current request.
            */
        }
    }
}
