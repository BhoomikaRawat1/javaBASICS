package Java;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner obj= new Scanner(System.in);
        int x =obj.nextInt();

        if(x%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
