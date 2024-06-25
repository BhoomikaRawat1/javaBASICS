package CollectionFramework;
import java.util.*;
public class Queuelist {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();{
            q.offer(10);
            q.offer(20);
            q.offer(30);
            q.offer(40);
            q.offer(50);
            System.out.println(q);
             System.out.println( q.peek());//returns the item that will be remove next but not remove.
              System.out.println( q.remove());//remove the item that will come first.
             System.out.println(q);
            System.out.println( q.poll());//return the item & remove also.
            System.out.println(q);
            while (!q.isEmpty()) {
                System.out.println(q.remove());
                System.out.println(q);}
        }
    }
}
