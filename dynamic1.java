public class vehicle {
    void ride(){

    }
}
class car extends vehicle{
    void ride(){
        System.out.println("you are riding a car");
    }
}
class bike extends vehicle{
    void ride(){
        System.out.println("you are riding a bike");
    }
}
class Mechanic {
    void check(vehicle v){
        System.out.println("checking");
        v.ride();
    }
}
 class Interfacedemo{
    public static void main(String[]args) {
        Mechanic m=new Mechanic();
        car c =new car();
        bike b = new bike();
        m.check(c);
        m.check(b);
    }
}
