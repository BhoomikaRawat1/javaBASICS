package oops;

public class Abstraction {
    public static void main(String[] args) {
     //  colour v1= new  colour();// abstract class have not object
        car c1=new car();
        c1.red();
        c1.black();
    }
}
   abstract class colour{
    //abstarct method have not body
    abstract void red();
    abstract void black();
}
class car extends colour{

    void red() {
        System.out.println("car is red");
    }
    void black() {
        System.out.println("car is black");
    }
}

