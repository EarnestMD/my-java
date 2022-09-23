package inheritance1;
import java.util.*;

class Employee implements Comparable<Employee>{
    protected String name;
    private double salary;
    Employee(String n,double s){
        name = n;
        salary = s;

    }

    public String getname(){return name;}
    public void setname(String n){name= n;}

    public Double getSalary(){return salary;}
    public void setSalary(double s){salary =s;}

    public void raiseSalary(double percent){
        salary +=salary*percent/100;
    }
    public boolean equals(Object obj){
    if(this==obj)
    return true;

    if(obj==null)
    return false;

    if (this.getClass() !=obj.getClass())
    return false;

    Employee e = (Employee)obj;
    return this.name.equals(e.name) && this.salary==e.salary;
    }

    public int compareTo(Employee e){//obj1.compareTo(obj2)obj1-obj2
        if(salary == e.salary)
        return 0;
        if(salary<e.salary)
        return -1;
      
        return 1;
    }

}

class Manager extends Employee{//derived class,sub class,child class
    private double bonus;
    Manager(String n,double s,double b){
        super(n,s);
        bonus = b;
    }
public void setbonus(double b){
bonus = b;
}

public Double getSalary(){  
    return super.getSalary()+bonus;
}

}
public class InheritanceDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram",35000);
        System.out.println(e1.getSalary());

        Employee e2 = new Manager("Ramya", 68000, 0);//polymorphisam
        Employee e3 = new Employee("Ram", 35000);

        System.out.println(e1.equals(e3));

        int[] arr = new int[50];
        Employee[] employees = new Employee[4];
        employees[0]= new Employee("Ram", 35000);
        employees[1]= new Employee("Hari", 32000);
        employees[2]= new Employee("Vidhya", 37000);
        employees[3]= new Manager("John", 65000.0,0.0);

        employees[3].setSalary(75000);
        Manager m1;
         if(employees[3] instanceof Manager){
            m1=(Manager)employees[3];
            m1.setbonus(20000);
         }

         Manager m2;
         if(employees[2]instanceof Manager)
         m1=(Manager)employees[2];

         for(Employee e:employees){//dynamic binding
          System.out.println(e.getname()+" "+e.getSalary());
         }
Arrays.sort(employees);

    }
}
