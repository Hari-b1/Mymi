import java.time.*;
class Rental{
    private static int RentalId ;
    private String Rental_id;
    private String[] RentedBooks;
    private String RentedCustomer;
    private LocalDate RentedDate;
    private LocalDate DueDate;
    private LocalDate ReturnDate;

    Rental(String[] RentedBooks, String Renter){
        this.RentedBooks = RentedBooks;
        this.RentedCustomer = Renter;
        this.RentedDate = LocalDate.now();
        this.Rental_id = String.valueOf(RentalId + 1);
        this.DueDate = RentedDate.plusDays(10);
    }

    public static Rental createRental(){
        int NumberOfRentedBooks;

        System.out.println("Enter the number of Books do you want to rent : ");
        NumberOfRentedBooks = App.getReader().nextInt();
        String[] RentedBooks = new String[NumberOfRentedBooks];
        for(int i = 0; i < NumberOfRentedBooks; i ++){
            System.out.println("Enter the book id : ");
            String Rented = App.getReader().nextLine();
            RentedBooks[i] = Rented;
        }

        System.out.println("Enter the customer id :");
        String Renter = App.getReader().nextLine();

        return new Rental(RentedBooks, Renter);
        
    } 

}