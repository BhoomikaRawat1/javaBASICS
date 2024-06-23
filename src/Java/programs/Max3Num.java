package Java.programs;

import java.util.Scanner;

public class Max3Num {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter num1.....");
        int num1 = obj.nextInt();
        System.out.println("enter num2.....");
        int num2 = obj.nextInt();
        System.out.println("enter num3.....");
        int num3 = obj.nextInt();

        if (num1 >= num2 && num1 >= num3) {

            System.out.println("Maximum num is" +" " +  num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Maximum num is" +" " +  num2);
        } else {
            System.out.println("Maximum num is3" + " " + num3);
        }
    }
}
