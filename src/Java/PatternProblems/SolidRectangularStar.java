package Java.PatternProblems;

import java.util.Scanner;

public class SolidRectangularStar {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter row");
        int row = obj.nextInt();
        System.out.println("Enter coloumn");
        int col = obj.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
