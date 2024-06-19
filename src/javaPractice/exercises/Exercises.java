package javaPractice.exercises;

public class Exercises {
    public static void main(String[] args) {

/*  Exercise 4:
    write the code to convert decimal numbers to binary format?
*/
        int num = 128;
        StringBuilder binary = new StringBuilder();
        while (num != 0){
            int remainder = num % 2;
            binary.insert(0, remainder);
            num = num / 2;
        }
        System.out.println("binary value :" + binary);
    }
}
