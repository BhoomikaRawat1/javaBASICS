package Java.programs;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int count = 0;
        int i;
        System.out.println("enter any number");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                System.out.println(n + " is prime number");
            }
            else
            {
                System.out.println(n + " is not prime number");
            }
        }
    }
