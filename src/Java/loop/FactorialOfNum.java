package Java.loop;
import java.util.Scanner;
public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int num = obj.nextInt();
        int fact =1;
        for (int i=num ; i>=1 ; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
