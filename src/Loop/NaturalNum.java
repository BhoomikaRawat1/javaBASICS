package Loop;

import java.util.Scanner;

public class NaturalNum {

            public static void main(String[] args)
            {
                System.out.println("enter number");
                Scanner obj= new Scanner(System.in);
                int num=obj.nextInt();
                int i,sum = 0;
                for(i = 1; i <= num; ++i)
                {
                    sum = sum + i;
                }
                System.out.println("Sum of Natural Numbers is = " + sum);
            }
        }
