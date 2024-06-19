package Java.basic;

public class trycatchexception {
    public static void main(String[] args) {
        int x[] = new int[5];
        System.out.println(x[4]);
        try {
            System.out.println(x[7]);
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("hello world");
    }
}
