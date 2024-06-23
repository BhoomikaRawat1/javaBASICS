package Java.programs;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter value of P");
        Double P=obj.nextDouble();
        System.out.println("enter value of R");
        Double R =obj.nextDouble();
        System.out.println("enter value of T");
        Double T =obj.nextDouble();
     //calculate simple interest
        Double SI= (P*R*T)/100;
        System.out.println(SI + " is the simple interset");
        //calculate compound interest
        Double CI= P*(Math.pow((R / 100 + 1),T));
        System.out.println(CI + "is the compound interset");
    }
}
