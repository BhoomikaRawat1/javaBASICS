package Java.basic.geneicsANDwrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
       // Integer obj= new Integer(12);

        Integer obj2=   Integer.valueOf('b');//autoboxing
        System.out.println(obj2);
        Boolean obj3=  Boolean.valueOf("bh");//autoboxing
        System.out.println(obj3);
        int age= obj2;//unboxing
        System.out.println(obj2);
    }
}
