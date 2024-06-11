package Loop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int i,fact=1;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}

