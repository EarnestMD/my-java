package Staticexample;

class StaticMain{

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        sd.normalmethod();//non static method calling using object name
        StaticDemo.demo();//static method calling using class name
        
        System.out.println(StaticDemo.count);//static variable calling using class name
        System.out.println(StaticDemo.nsted.val);//nested static variable calling
    }
}
