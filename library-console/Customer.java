import java.util.Scanner;
public class Customer {
    private String Customer_id;
    private String Customer_name;
    private String Customer_address;
    private String Customer_contact;
    private String Customer_mail;
    private int Rented_book_count;
    private float Due_amount;
    private static Scanner in;

    public static Scanner getReader(){
        if(in == null){
            in = new Scanner(System.in);
            return in; 
        }
        return in;
    }
    Customer(String Customer_id, String Customer_name, String Customer_address, String Customer_mail, String Customer_contact){
        this.Customer_id = Customer_id;
        this.Customer_name = Customer_name;
        this.Customer_address = Customer_address;
        this.Customer_mail = Customer_mail;
        this.Customer_contact = Customer_contact;
        this.Due_amount = 0;
        this.Rented_book_count = 0;
    }

    public static Customer create_customer(){
        System.out.println("Enter the customer_id : ");
        String Customer_id = getReader().nextLine();
        System.out.println("Enter the customer_name : ");
        String Customer_name = getReader().nextLine();
        System.out.println("Enter the customer_address : ");
        String Customer_address = getReader().nextLine();
        System.out.println("Enter the customer_mail : ");
        String Customer_mail = getReader().nextLine();
        System.out.println("Enter the customer_contact : ");
        String Customer_contact = getReader().nextLine();
        return new Customer(Customer_id, Customer_name, Customer_address, Customer_mail, Customer_contact);  
    }
}
