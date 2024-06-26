package com.javapractice.encapsulation.otherpackage;

import com.javapractice.encapsulation.package1.Example1;

public class Example5 extends Example1 {
    public static void main(String[] args) {
        Example1 var1 = new Example1();

        System.out.println("public Variable = " + var1.publicVariable);
//        System.out.println("default variable = " + var1.defaultVariable);
//        System.out.println("private Variable = " + var1.privateVariable);
//        System.out.println("protected Variable = " + var1.protectedVariable);

//        var1.defaultMethod();
//        var1.privateMethod();
//        var1.protectedMethod();
        var1.publicMethod();

//  private,protected and default variables or method cannot be accessed
//  but only protected variable or method can be accessed only through child object

        Example5 var = new Example5();
        System.out.println("protected Variable through child object = " + var.protectedVariable);
        var.protectedMethod();
    }
}
