package Java.Array;
//program of two arrays are equal or not.
import java.util.Arrays;

public class EqualsArray {
    public static void main(String[] args) {
        int a[] = { 30, 25, 40 };
        int b[] = { 30, 25, 40 };
        boolean result = Arrays.equals(a, b);
        if(result == true) {
            System.out.println("Two arrays are equal");
        }
        else {
            System.out.println("Two arrays are not equal");
        }
    }
}

