package Oops1;

public class vehicle {
  int wheelsCount;
  String color;
  vehicle(){
      System.out.println("creating a variable instance");
  }
void start(){
    System.out.println("vehicle is starting");
     }
}
class car extends vehicle{
    void start(){
        super.start();
        System.out.println("car is starting");
    }
    car(){
        System.out.println("car is being created");
    }
    public static void main(String[] args) {
        car obj=new car();
        System.out.println( (obj.wheelsCount=4));
        System.out.println(obj);
      obj.start();
      obj.color="red";
    }
}

