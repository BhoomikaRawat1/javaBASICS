package Java;

import java.util.Scanner;

public class VowelConst {
    public static void main(String[] args) {
        System.out.println("enter any char");
        Scanner obj = new Scanner(System.in);
        char i = obj.next().charAt(0);
        switch (i) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("char is vowel");
                break;
            default:
                System.out.println("char is consonant");

        }
    }
}
