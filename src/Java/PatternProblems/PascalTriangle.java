package Java.PatternProblems;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int rows=obj.nextInt();
        for (int i = 0; i < rows; i++)
        {
            int num = 1;
            for (int j = 0; j < rows - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
