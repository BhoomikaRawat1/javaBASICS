package Java.loop;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner obj= new Scanner(System.in);
        int num=obj.nextInt();
        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < num; ++i)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
