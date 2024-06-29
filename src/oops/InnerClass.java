package oops;

public class InnerClass {

// by nonstatic
   class toy{
        int price;
    }
    // by static
     static class toys{
       int doll;
    }
    public static void main(String[] args) {
        toy t1= new InnerClass().new toy();//nonstatic class obj
        toys t2=new InnerClass.toys();//static class obj
        t2.doll=15;
        t1.price=105;
    }
}
