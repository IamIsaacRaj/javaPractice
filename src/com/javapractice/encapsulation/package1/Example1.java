package com.javapractice.encapsulation.package1;

public class Example1 {
    int defaultVariable = 100;
    private int privateVariable = 456;

    protected int protectedVariable = 200;
    public int publicVariable = 123;

    void defaultMethod(){
        System.out.println("Default Method called");
    }

    private void privateMethod(){
        System.out.println("Private Method called");
    }

    protected void protectedMethod(){
        System.out.println("Protected method called");
    }

    public void publicMethod(){
        System.out.println("Public Method called");
    }

    public static void main(String[] args) {
        Example1 var1;

        var1 = new Example1();
        System.out.println("default variable = " + var1.defaultVariable);
        System.out.println("private Variable = " + var1.privateVariable);
        System.out.println("public Variable = " + var1.publicVariable);
        System.out.println("protected Variable = " + var1.protectedVariable);

        var1.defaultMethod();
        var1.privateMethod();
        var1.protectedMethod();
        var1.publicMethod();
    }
}
