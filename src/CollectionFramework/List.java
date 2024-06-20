package CollectionFramework;
import java.util.ArrayList;
import java.util.List;
   class Lists {
    public static void main(String[] args) {
       List<Integer> list=new ArrayList<>();
      // List<Integer> list1=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(31);
        list.add(40);
     System.out.println(list.get(2));
     System.out.println(list.set(1,200));
     list.add(3,400);
     System.out.println(list);
     list.remove(3);
    // System.out.println(list);

       /* list1.add(11);
        list1.add(21);
        list1.add(31);*/
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(40));
        System.out.println(list.remove(2));
        System.out.println(list);
        /*list.addAll(list1);
        System.out.println(list);
        list.removeAll(list1);
        System.out.println(list);
        list.retainAll(list1);
        System.out.println(list);*/


    }
}
