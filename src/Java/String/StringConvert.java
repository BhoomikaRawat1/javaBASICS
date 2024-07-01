package Java.String;

import java.util.Scanner;
public class StringConvert {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // char to string
        System.out.println("enter your char as input");
       char myChar = obj.next().charAt(0);
        String myString = Character.toString(myChar);
        System.out.println( "your input char to string is : " + myString );
    }
}
