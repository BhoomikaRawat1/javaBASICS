package Java.loop;
import java.util.Scanner;
public class factorOfNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number");
        int num =obj.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
