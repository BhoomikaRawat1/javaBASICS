package Java.programs;

import java.util.Scanner;

public class AirthmeticOperations {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter your first number");
        int a =obj.nextInt();
        System.out.println("Enter your second number");
        int b= obj.nextInt();
        System.out.println("Addition of two numbers is: "+(a+b));
        System.out.println("subtraction of  two numbers is: "+(a-b));
        System.out.println("Multiplication of  two numbers is: "+(a*b));
        System.out.println("Division of  two numbers is: "+(a/b));
        System.out.println("Modulus of  two numbers is: "+(a%b));
    }
}
