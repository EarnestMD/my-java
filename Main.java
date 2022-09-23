package ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customerBook = new Customer();

        customerBook.addCustomer();
        customerBook.addCustomer();
        customerBook.addCustomer();
        customerBook.addCustomer();
        customerBook.addCustomer();
        customerBook.printArrayList();
        customerBook.removecustomer();
        customerBook.printArrayList();
        customerBook.removecustomer();
        customerBook.printArrayList();
    }
}
