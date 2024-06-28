package Java.Switch;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println(" 1: ADD"  +  "  2: SUBTRACTION" + "  3: DIVIDE" + "  4: MULTIPLY");
        int choice = obj.next().charAt(0);
        System.out.println("enter first number for your calculation");
        int a= obj.nextInt();
        System.out.println("enter second number for your calculation");
        int b= obj.nextInt();
        int result;
        switch (choice){
                   case '1': {
                    System.out.println("your result is " + (result = a + b));
                    break;
                   }
                   case '2':{
                    System.out.println("your result is " + (result=a-b));
                    break;
                   }
                   case '3':{
                   System.out.println("your result is " + (result=a/b));
                   break;
                  }
                  case '4':{
                  System.out.println("your result is " + (result=a*b));
                  break;
                  }

            }
        }
    }


