package Java.PatternProblems;

import java.sql.SQLOutput;
import java.util.Scanner;
public class HalfPyramidStar {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter rows");
        int row=obj.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
