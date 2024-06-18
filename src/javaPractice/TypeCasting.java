package javaPractice;

public class TypeCasting {
    public static void main(String[] args) {
/*  Type casting is the process of converting a variable from one data type to another.
    There are two main types of type casting in Java:

    1.Implicit Casting (Widening Conversion): Automatically performed by the Java compiler
    when converting a smaller data type to a larger data type
    Safe and does not lead to data loss.
    (e.g., byte to int, int to float).

    2.Explicit Casting (Narrowing Conversion): Needs to be explicitly performed
    by the programmer when converting a larger data type to a smaller data type
    (e.g., int to byte, float to int).
    This can potentially lead to data loss.
*/
//  Byte to Int Conversion (Implicit Casting)

        byte age;
        age = 26;
        int ageValue;
        ageValue = (int)age;

        System.out.println("byte value to int : " + ageValue);

//  Float to Int Conversion (Explicit Casting)

        float value;
        value = 2548.36F;

        int intValue;
        intValue = (int)value;

        System.out.println("float value to int : " + intValue);

//  Int to Byte Conversion (Explicit Casting)

        ageValue = 130;
        age = (byte)ageValue;

        System.out.println("int value to byte : " + age);
    }
}
