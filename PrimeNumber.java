package primenumber;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner (System.in);
        System.out.println("Enter a Integer - ");
        
        int number ;
        number = Scan.nextInt();
       
        //for loop for number 0 and 1 since those are not prime
        if(number == 0 || number == 1) {
            System.out.println(number+ " is not a prime number.");
        }
        //for loop that defines number 2 and 3 as a prime. Since my code was bugginng I created it.
        if(number == 2 || number == 3 ) {
            System.out.println(number+ " is a prime number.");
        }
        else {
            for(int i = 2 ; i <= number/2; i++) {
                
                if( number % i == 0) {
                    System.out.println(number+ " is not a prime number.");
                }
                else {
                    System.out.println(number+ " is a prime number.");
                }
            break;
            }
        }
    }           
}
