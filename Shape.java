package dynamic;

public class Shape {
    public void draw(){
        System.out.println("drawing");
    }
}
class circle extends Shape{
    public void draw(){
        System.out.println("Draw circle");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Draw Triangle");
    }
}

  class top{
    public static void main(String[] args) {
        Shape s;
        s = new Shape();
        s.draw();
        s= new circle();
        s.draw();
        s = new Triangle();
        s.draw();

    }
}
