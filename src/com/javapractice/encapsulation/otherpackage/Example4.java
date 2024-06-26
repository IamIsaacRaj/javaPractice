package com.javapractice.encapsulation.otherpackage;

import com.javapractice.encapsulation.package1.Example1;

public class Example4 {
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

    }

}
