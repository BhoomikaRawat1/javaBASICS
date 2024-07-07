package Java.Array;

public class SmallestNumber {
    public static void main(String[] args) {
        int [] arr = new int [] {143,136,2,89,48};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element of array: " + min);
    }
}

