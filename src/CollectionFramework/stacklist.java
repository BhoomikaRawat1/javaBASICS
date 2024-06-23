package CollectionFramework;
import java.util.*;
public class stacklist {
    public static void main(String[] args) {
      Stack<String> name= new Stack<>();
      name.push("riya");
      name.push("priya");
      name.push("siya");
      name.push("niya");
        System.out.println(name);
        System.out.println(name.pop());//remove item form top
        System.out.println(name.peek());//print top item
        System.out.println(name.empty());//check stack is empty or not
    }
}
