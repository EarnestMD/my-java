package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Customer{

    private ArrayList<String> customerList = new ArrayList<String>();

    Scanner sc = new Scanner(System.in);

    public void addCustomer(){

        System.out.println("Enter customer name :");

        String customer = sc.nextLine();

        customerList.add(customer);//arraylist add method
        System.out.println("Customer added to the list successfully");
    }

    public void removecustomer(){

        System.out.println("Enter customer name to remove :");

        String customer = sc.nextLine();

        int position = findCustomer(customer);

        if(position == -1){
            System.out.println("Customer not in the list");
        }else{
            customerList.remove(position);//arraylist remove method
            System.out.println("customer name removed from the list");
        }


    }
public int findCustomer(String customer){
    if (customerList.contains(customer)){//arraylist contains method
        return customerList.indexOf(customer);//arraylist indexof method

    }else{
        return -1;
    }

}

public void printArrayList(){

    for(int i=0;i<customerList.size();i++){//arraylist size method
System.out.println("Customer "+(i+1)+": "+ customerList.get(i));
    }
}
}



