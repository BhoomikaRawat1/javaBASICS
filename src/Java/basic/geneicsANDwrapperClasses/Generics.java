package Java.basic.geneicsANDwrapperClasses;

public class Generics {
    public static void main(String[] args) {
        customer<String,String> obj=new customer<>("bhumi","rawat");
        customer<Integer, String> obj1=new customer<>(1234, "bhumika");
        System.out.println(obj1.getId());
        System.out.println(obj1.name);
        System.out.println(obj.getId());
        System.out.println(obj.name);
    }
}
class customer<E,V> {
    E id;
    V name;

    public customer(E id, V name) {
        this.id = id;
        this.name = name;
    }

    E getId() {
       return id;
   }
}
