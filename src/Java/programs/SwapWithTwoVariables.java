package Java.programs;

import java.util.Scanner;

public class SwapWithTwoVariables {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number");
        int a= obj.nextInt();
        System.out.println("enter second  number");
        int b= obj.nextInt();
        System.out.println("before swapping " + a + " & "+  b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping " + a + " & " + b );
    }
}
