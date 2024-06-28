package Java.Switch;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        int num= obj.nextInt();
        switch (num) {
            case 1:
                System.out.println("This is sunday");
                break;
            case 2:
                System.out.println("This is monday");
                break;
            case 3:
                System.out.println("This is tuesday");
                break;

            case 4:
                System.out.println("tThis is wednesday");
                break;

            case 5:
                System.out.println("This is thursday");
                break;
            case 6:
                System.out.println("This is friday");
                break;

            case 7:
                System.out.println("This is saturday");
                break;
            default:
                System.out.println("invalid number.... please enter number into range of 1 TO 7");
        }
    }
}

