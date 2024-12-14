import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
class Rental{
    private static int RentalId ;
    private String Rental_id;
    private String RentedBooks;
    private String RentedCustomer;
    private LocalDate RentedDate;
    private LocalDate DueDate;
    private LocalDate ReturnDate;
    private static Map<String, Rental> RentalList = new HashMap<>();

    Rental(String RentedBooks, String Renter){
        this.RentedBooks = RentedBooks;
        this.RentedCustomer = Renter;
        this.RentedDate = LocalDate.now();
        this.Rental_id = String.valueOf(RentalId + 1);
        this.DueDate = RentedDate.plusDays(10);
    }

    public void putRental(Rental rent){
        RentalList.put(rent.Rental_id, rent);
    }

    public static Rental createRental(String CustomerId){
    App.getReader().nextLine();                                                  
       System.out.println("Enter the book id you want to borrow : ");
       String RentedBooks = App.getReader().nextLine();
       String Renter = CustomerId;

        return new Rental(RentedBooks, Renter);
        
    } 

   public static float ReturnRequest(){
    float Due_amount = (float)0.0 ;
    App.getReader().nextLine();
    System.out.println("Enter the Rental-id to return : ");
    String RentalId = App.getReader().nextLine();
    Rental rent = RentalList.get(RentalId);
    
    String returnD = App.getReader().nextLine();
    LocalDate ReturnDate = LocalDate.parse(returnD);
    int returnResult = rent.DueDate.compareTo(ReturnDate);
    if(returnResult > 0){
        float Difference = (float)ChronoUnit.DAYS.between(rent.DueDate, ReturnDate);
        Due_amount =(float) ((Difference) * 2.5) ;
    }




    return Due_amount;
   }

}