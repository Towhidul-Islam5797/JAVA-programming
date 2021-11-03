package trianglepattern;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
        
        int rows;
        System.out.println("Enter a Rows number for the pattern");
        rows = scan.nextInt();
        System.out.println(""); //print a new line 
        
        //for loop to build the pattern
        
        for (int i = rows; i >= 1; --i) {  
            //for loop that creates rows
            for (int j = 1; j <= i; ++j) {
                
                /*for  loop to make the pattern like
                1 2 3 4
                1 2 3
                1 2
                1 
                for row number 4*/
                
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    
}
