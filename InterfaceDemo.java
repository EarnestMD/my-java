package interface1;

interface Ridable {
    void display();
    default void ride() {
        System.out.println("you are using default interface method ride");
    }
}

class Bike implements Ridable {
public void display(){
    System.out.println("display bike");
}
    public void ride() {
        System.out.println("you are bike class overriding interface default method ride");
    }

}

class Car implements Ridable {
    public void display (){
        System.out.println("display bike");
    }
    public void ride() {
        System.out.println("you are car class overriding interface default method ride");
    }

}

class Mechanic {

    void check(Ridable r) {
        System.out.println("checking");
        r.ride();
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        Ridable r = new Car();
        Mechanic m = new Mechanic();
        Car c = new Car();
        Bike b = new Bike();
        m.check(r);
        m.check(b);
c.display();
    }
}
