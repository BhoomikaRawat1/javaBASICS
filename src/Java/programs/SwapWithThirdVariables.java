package Java.programs;

import java.util.Scanner;

public class SwapWithThirdVariables {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number");
        int a= obj.nextInt();
        System.out.println("enter second number");
        int b= obj.nextInt();
        System.out.println("before swapping " + a + " & " + b );
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping " + a + " & " + b );
    }
}
