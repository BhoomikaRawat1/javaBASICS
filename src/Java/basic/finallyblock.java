package Java.basic;

public class finallyblock {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 0;
        System.out.println(a / b);
        System.out.println(a + b);   

        try {
            System.out.println(a / c);
        } catch (Exception e) {
            System.out.println("exception handled");
        } finally {
            System.out.println("i will always run");
        }
    }
}
