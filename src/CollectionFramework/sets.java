package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> s =new LinkedHashSet<>();
        Set<Integer> q =new TreeSet<>();
        //hashset
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        System.out.println(set);
        //LinkedHashSet
        set.remove(11);
        System.out.println(set);
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);
        //TreeSet
        q.add(2);
        q.add(4);
        q.add(6);
        System.out.println(q);
    }
}
