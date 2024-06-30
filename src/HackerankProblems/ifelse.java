package HackerankProblems;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int n = obj.nextInt();
        if (n % 2 == 0) {
            if ((2<n) && (n>5) || (n>20))  {
                System.out.println("not weird");
            }
        } else {
            System.out.println("weird");
        }
    }
}
