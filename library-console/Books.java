import java.util.Scanner;

public class Books {
    private String Book_id ;
    private String Book_name ;
    private String Authour_name ;
    private boolean Rented_status;
    private int Rented_count ;
    private static Scanner in;

    public static Scanner getReader(){
        if(in == null){
            in = new Scanner(System.in);
            return in; 
        }
        return in;
    }
    Books(String Book_id, String Book_name, String Authour_name){
        this.Book_id = Book_id;
        this.Book_name = Book_name;
        this.Authour_name = Authour_name;
        this.Rented_status = false;
        this.Rented_count = 0;
    }



    public static Books AddBook(){
        System.out.println("Enter the Book_id :");
        String Book_id = getReader().nextLine();
        System.out.println("Enter the Book_name :");
        String Book_name = getReader().nextLine();
        System.out.println("Enter the Authour_name :");
        String Authour_name = getReader().nextLine();

        return new Books(Book_id, Book_name, Authour_name);

    }
}
