package Loop;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        int num= obj.nextInt();
        int rev=0;
        while(num != 0)
        {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num/10;
        }
        System.out.println("The reverse of the given number is" + rev);
    }
}

