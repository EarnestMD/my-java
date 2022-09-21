package application;

public class AbstractDemo {
   
    public static void main(String[] args) {
      //  MySubAbstract a = new MySubAbstract(); a.abs1();
      //  MySubAbstract b = new MySubAbstract(); b.sub1();
      //  MySubAbstract c = new MySubAbstract(); c.nonAbs2();
      //  MySubAbstract d = new MySubAbstract(); d.nonAbs1();
      //  MySubAbstract e = new MySubAbstract(); e.nonAbs2(); 
      //  MyAbstract f = new MySubAbstract(); f.abs1();
      //  MyAbstract g = new MySubAbstract(); g.nonAbs1();
      //  MyAbstract h = new MySubAbstract(); h.sub1();
      MySubAbstract a = new MySubAbstract(); 
      a.abs1();
      a.abs2();
      a.sub1();
      a.nonAbs1();
      a.nonAbs2(); 
     MyAbstract f = new MySubAbstract(); 
     f.abs1();
      f.nonAbs1();
      
      ((MySubAbstract)f).sub1();
     }
   }
