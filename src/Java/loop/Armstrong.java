package Java.loop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number");
        int num=obj.nextInt();
        int originalNumber;int remainder;int  result = 0;

        originalNumber =num;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}

