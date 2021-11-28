package divisiblity;
import java.util.Scanner;

public class Divisiblity {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int number ;
        boolean temp = false;
        System.out.print("Enter a number : ");
        number = scan.nextInt();
        
        if(number %5 == 0 && number %6 == 0){
            temp = true;
        }
        System.out.println("Is "+ number +" divisible by 5 and 6? : " + temp);
        
        if(number %5 == 0 || number %6 == 0){
            temp = true;
        }
        System.out.println("Is "+ number +" divisible by 5 or 6? : " + temp);
        
        if(number %5 == 0 ^ number %6 == 0){
            temp = true;
        }
        System.out.println("Is "+ number +" divisible by 5 or 6? But both not : " + temp);
    }
    
}
