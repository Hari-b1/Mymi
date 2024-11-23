import java.util.Scanner;

public class App{

    private static Scanner in;

    public Scanner getReader(){
        if(in == null){
            in = new Scanner(System.in);
            return in;
        }
        else 
            return in;
    }
    public static void main(String[] args) {
        App obj = new App();
        System.out.println("Hello World");
        int scanner_check = obj.getReader().nextInt();
        System.out.println(scanner_check + " "); 
    }
}