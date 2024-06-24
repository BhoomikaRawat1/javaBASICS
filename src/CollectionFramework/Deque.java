package CollectionFramework;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        dq.offer(100);
        dq.offer(200);
        dq.offer(300);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq);
        System.out.println(dq.peekLast());
        System.out.println(dq);

    }
}
