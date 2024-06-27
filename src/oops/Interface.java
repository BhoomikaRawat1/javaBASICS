package oops;

public class Interface {
    public static void main(String[] args) {
       dog d1= new dog();
       d1.action();
       d1.drinks();
       d1.eats();
    }
}
    interface animal {
        void eats();
        default void drinks(){
            System.out.println("dog drinks");
        }
        void action();
    }
    class dog implements animal {

        public void eats() {
            System.out.println("dog is eating");
        }
        public void action() {
            System.out.println("dog performs an action");
        }
    }

