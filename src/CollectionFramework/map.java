package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        //HashMap
        Map<Integer,String> m1=new HashMap<>();
        m1.put(10,"bhumi");
        m1.put(30,"pihu");
        m1.put(22,"kajuu");
       // System.out.println(m1);
        // iterating over map by for each loop
        for(Map.Entry<Integer,String> e: m1.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        //LinkedHashMap
        Map<String,Integer> m2= new LinkedHashMap<>();
        m2.put("bhumi",11);
        m2.put("gunuu",31);
        m2.put("kajuu",23);
        System.out.println(m2);
        //TreeMap
        Map<Integer,String > m3=new TreeMap<>();
        m3.put(200,"red");
        m3.put(100,"blue");
        for(Map.Entry<Integer,String> e: m3.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
      //  System.out.println(m3);

    }
}
