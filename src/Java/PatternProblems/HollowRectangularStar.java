package Java.PatternProblems;

import java.util.Scanner;
public class HollowRectangularStar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter row");
        int row = obj.nextInt();
        System.out.println("Enter coloumn");
        int col = obj.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
