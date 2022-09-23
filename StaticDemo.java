package Staticexample;

public class StaticDemo {
    
static int count =100;//static variable or class variable

public static void demo(){//static method

int a = 20;
int b = count+a;
System.out.println(b);
}

static {//static block

    System.out.println("static block called");
}
public void normalmethod(){//non static method

    System.out.println("non static method called");

}

static class nsted {//nested class

    static int val=12;//must be static variable
}

}
