package com.javapractice.java8features.defaultmethods;

public interface Vehicle {
    void start();

/*  Default methods allow interfaces to have methods with a default implementation.
    This feature helps in evolving interfaces without breaking existing code
    that implements those interfaces.
*/
     default void stop(){
        System.out.println("Vehicle Stopped");
    }
}
