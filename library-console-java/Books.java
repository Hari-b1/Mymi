
public class Books {
    public String Book_id ;
    public String Book_name ;
    public String Authour_name ;
    public boolean Rented_status;
    public int Rented_count ;
    


    Books(String Book_id, String Book_name, String Authour_name){
        this.Book_id = Book_id;
        this.Book_name = Book_name;
        this.Authour_name = Authour_name;
        this.Rented_status = false;
        this.Rented_count = 0;
    }


    



    public static Books AddBook(){
        App.getReader().nextLine();
        System.out.println("Enter the Book_id :");
        String Book_id = App.getReader().nextLine();
        System.out.println();
        System.out.println("Enter the Book_name :");
        String Book_name = App.getReader().nextLine();
        System.out.println("Enter the Authour_name :");
        String Authour_name = App.getReader().nextLine();

        return new Books(Book_id, Book_name, Authour_name);

    }

    public void MarkBook(){
        this.Rented_status = false;
    }

    public void SetStatus(){
        this.Rented_status = true;
    }
}
