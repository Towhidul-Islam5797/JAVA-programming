package addingdigitsofitegers;
import java.util.Scanner;

public class AddingDigitsOfItegers {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int number, temp = 0;
        System.out.print("Enter a Integer from 0 to 1000 : ");
        number = scan.nextInt();
        
        while(number != 0) {
            temp = temp + (number % 10);
            number /= 10;
        }
        System.out.println("The sum of the digits is : "+ temp);
    }
    
}
/* Result :
Enter a Integer from 0 to 1000 : 999
The sum of the digits is : 27
*/
