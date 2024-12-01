import java.util.Scanner;
public class Customer {
    private String Customer_id;
    private String Customer_name;
    private String Customer_address;
    private String Customer_contact;
    private String Customer_mail;
    private int Rented_book_count;
    private float Due_amount;
    

   
    Customer(String Customer_id, String Customer_name, String Customer_address, String Customer_mail, String Customer_contact){
        this.Customer_id = Customer_id;
        this.Customer_name = Customer_name;
        this.Customer_address = Customer_address;
        this.Customer_mail = Customer_mail;
        this.Customer_contact = Customer_contact;
        this.Due_amount = 0;
        this.Rented_book_count = 0;
    }

    public  String getCustomerId(){
        return this.Customer_id;
    }

    public String getCustomerName(){
        return this.Customer_name;
    }

    public static Customer create_customer(){
        App.getReader().nextLine();
        System.out.println("Enter the customer_id : ");
        String Customer_id = App.getReader().nextLine();
        System.out.println("Enter the customer_name : ");
        String Customer_name = App.getReader().nextLine();
        System.out.println("Enter the customer_address : ");
        String Customer_address = App.getReader().nextLine();
        System.out.println("Enter the customer_mail : ");
        String Customer_mail = App.getReader().nextLine();
        System.out.println("Enter the customer_contact : ");
        String Customer_contact = App.getReader().nextLine();
        return new Customer(Customer_id, Customer_name, Customer_address, Customer_mail, Customer_contact);  
    }

    public void DuePayment(){
        System.out.println("Your balance is NIL...");
    }


    public void CustomerOptions(){

        System.out.println("Press 1 to borrow a book : ");
        System.out.println("Press 2 to return a book :");
        System.out.println("Press 3 to pay the due amount :");
        System.out.println("Press 4 to quit : ");
        int choice = App.getReader().nextInt();
        switch(choice){
            case 1 : Rental rental = Rental.createRental(this.Customer_id);
            break;
            
            case 2 : this.Due_amount = this.Due_amount + Rental.ReturnRequest();
            break;

            case 3 : this.DuePayment();
            break;

            case 4 : break;
        }
    }
}
