package Java.basic.geneicsANDwrapperClasses;

public class GenericsMethod {
    public static void main(String[] args) {
        printdata("hello world");
        printdata(12);
        printdata(true);
        GenericsMethod obj = new GenericsMethod();
        obj.doubledata("bhumi");
        obj.doubledata(123);

    }
   static<E> void printdata(E data)// by static
   {
       System.out.println(data);
   }
   <V> void doubledata(V data)// by non static
   {
       System.out.println(data);
   }
}
