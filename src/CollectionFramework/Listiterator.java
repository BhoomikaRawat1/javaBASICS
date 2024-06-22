package CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Listiterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("grapes");
        fruits.add("banana");
        int i;
        for(i = 0; i < fruits.size(); i++)
        {
            System.out.println(" by for loop:" + fruits.get(i));
        }
        System.out.println("........................");
        for(String fruit: fruits){
           System.out.println(" by for each : "+fruit);
       }
          System.out.println("........................");
        Iterator<String> f= fruits.iterator();
        while (f.hasNext()){
            System.out.println(" by iterator :"  +  f.next());
        }
    }
}

