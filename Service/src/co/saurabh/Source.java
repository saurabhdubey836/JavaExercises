package co.saurabh;

import java.util.Scanner;
interface AdminService {
    public void searchToy(int Id);
}
interface CustomerService {
    public void searchCustomer(int Id);
}
class Toy {
    int toyId;
    String toyName;
    String toyType;
    int minAge;
    int maxAge;
    double price;
    int rentalAmt;
    int refundableDeposit;
    int quantity;
    public Toy(int toyId, String toyName, String toyType, int minAge, int maxAge, double price, int refundableDeposit, int quantity, int rentalAmt) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyType = toyType;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.price = price;
        this.rentalAmt = rentalAmt;
        this.refundableDeposit = refundableDeposit;
        this.quantity = quantity;
    }
    public int getToyId() {
        return toyId;
    }
    public String getToyName() {
        return toyName;
    }
    public String getToyType() {
        return toyType;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getRentalAmount() {
        return rentalAmt;
    }
}
class Customer {
    private int customerId;
    private String customerName;
    private String email;
    private String password;
    private String address;
    public Customer(int customerId, String customerName, String email, String password, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.address = address;
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public int getcustomerId() {
        return customerId;
    }

    public String getcustomerName() {
        return customerName;
    }
}

class AdminServiceImpl implements AdminService {
    public static Toy availableToys[] = new Toy[5];
    AdminServiceImpl() {
        availableToys[0] = new Toy(120, "Rubber Ducky", "Toy", 1, 3, 200, 20, 200, 20);
        availableToys[1] = new Toy(130, "Car", "Toy", 1, 5, 100, 30, 20, 100);
        availableToys[2] = new Toy(150, "Kite", "Toy", 3, 8, 100, 50, 20, 100);
        availableToys[3] = new Toy(180, "Airplane", "Toy", 4, 7, 500, 30, 50, 20);
    }
    public void searchToy(int toyId) {
        for (int i = 0; i < 4; i++) {
            if (availableToys[i].getToyId() == toyId) {
                System.out.println("Id: " + availableToys[i].getToyId());
                System.out.println("Toy Name: " + availableToys[i].getToyName());
                break;
            }
        }
    }


}
class CustomerServiceImpl implements CustomerService {
    /*public*/ static Customer[] customerArray = new Customer[5];
    public CustomerServiceImpl() {
        customerArray[0] = new Customer(100, "Karthi", "kar@gmail.com", "kar#2", "Bangalore");
        customerArray[1] = new Customer(101, "Kumar", "km@mail.com", "km#2", "Bangalore");
        customerArray[2] = new Customer(102, "Rakesh", "rak@mail.com", "rak#45", "Chennai");
        customerArray[3] = new Customer(103, "Rakshan", "shan@mail.com", "an#2", "Mumbai");
        customerArray[4] = new Customer(104, "Virat", "rat@mail.com", "at#45", "Pune");

    }
    public void searchCustomer(int Id) {
        for (int i = 0; i < 4; i++) {
            if (customerArray[i].getcustomerId() == Id) {
                System.out.println("Id: " + customerArray[i].getcustomerId());
                System.out.println("Name: " + customerArray[i].getcustomerName());
                break;
            }
        }
     
    }
}

public class Source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            int Id = sc.nextInt();
            CustomerServiceImpl cs = new CustomerServiceImpl();
            cs.searchCustomer(Id);

        } else if (n == 2) {
            int Id = sc.nextInt();
            AdminService as = new AdminServiceImpl();
            as.searchToy(Id);

        }

    }
}

