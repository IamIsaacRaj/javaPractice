package com.javapractice.encapsulation.package1;

public class Example3 extends Example1 {
    public static void main(String[] args) {
        Example1 var1;

        var1 = new Example1();
        System.out.println("default variable = " + var1.defaultVariable);
//      System.out.println("private Variable = " + var1.privateVariable);
//       private variables cannot be accessed outside the class
        System.out.println("public Variable = " + var1.publicVariable);
        System.out.println("protected Variable = " + var1.protectedVariable);

        var1.defaultMethod();
//        var1.privateMethod(); // cannot access outside class
        var1.protectedMethod();
        var1.publicMethod();
    }
}
