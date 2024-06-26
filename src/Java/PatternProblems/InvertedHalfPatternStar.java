package Java.PatternProblems;

import java.util.Scanner;

public class InvertedHalfPatternStar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter row");
        int row = obj.nextInt();
        System.out.println("enter coloumn");
        int col = obj.nextInt();
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = row; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
