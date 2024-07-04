package Java.programs;

import java.util.Scanner;
public class PetersonNumber {
    public static void main(String[] args) {
        int fact, rem, sum = 0;
       Scanner obj=new Scanner(System.in);
        System.out.print("Please Enter Number to Check Peterson");
        int pnum = obj.nextInt();
        for(int temp = pnum; temp > 0; temp = temp/10){
            fact = 1;
            rem = temp % 10;
            for(int i = 1; i <= rem; i++)
            {
                fact = fact * i;
            }
            sum = sum + fact;
        }

        if (sum == pnum)
        {
            System.out.println(pnum +  " is a Peterson Number");
        }
        else
        {
            System.out.println(pnum +  " is Not a Peterson Number");
        }
    }

}
