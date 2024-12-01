import java.util.*;

public class App{

    private static Scanner in;
    HashMap<String, Customer> CustomerList = new HashMap<>();
    HashMap<String, Books> BookList = new HashMap<>();

    public void customerList(Customer customer){
        CustomerList.put(customer.getCustomerId(), customer);
    }

    public void bookList(Books book){
        BookList.put(book.Book_id, book);
    }

    public static Scanner getReader(){
        if(in == null){
            in = new Scanner(System.in);
            return in;
        }
        else 
            return in;
    }


    public void viewBook(){
        for(String key : BookList.keySet()){

            System.out.println("------------------------------------------------------");
            Books LibraryBook = BookList.get(key);
            System.out.println(LibraryBook.Book_id);
            System.out.println(LibraryBook.Book_name);
            System.out.println(LibraryBook.Authour_name);
            System.out.println(LibraryBook.Rented_status);
            
        }
    }

    public void CustomerValidity(){
        App.getReader().nextLine();1
        System.out.println("Enter the customer id : ");
        String Customer = App.getReader().nextLine();
        if(CustomerList.containsKey(Customer)){
            Customer User = CustomerList.get(Customer);
            System.out.println("You are successfully logged in as " + User.getCustomerName());
            User.CustomerOptions();
        }
        else{
            System.out.println("You are not a user in the libraray to access the customerOptions register as a user..");
        }
        return;
    }

    
    public static void main(String[] args) {
        App Librarian = new App();
        System.out.println("Hello World");
        
        console :
        while(true){
            System.out.println("Press 1 to create a customerId : ");
            System.out.println("Press 2 to add a book to the library :");
            System.out.println("press 3 to view the books in the library :");
            System.out.println("Press 4 to Enable customer options : ");
            System.out.println("To quit the program press 5 : ");

            int choice = getReader().nextInt();
            switch(choice){
                case 1 :  Customer customer = Customer.create_customer();
                          Librarian.customerList(customer);
                        break;
                
                case 2 : Books book = Books.AddBook();
                         Librarian.bookList(book);
                        break;
                
                case 3 : Librarian.viewBook();
                        break;

                case 4 :Librarian.CustomerValidity();
                        break; 
                
                case 5 :
                        break console;
            }

            

        }
    }
}