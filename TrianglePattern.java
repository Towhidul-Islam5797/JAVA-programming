package trianglepattern;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
        
        int rows;
        System.out.print("Enter a Rows number for the pattern : ");
        rows = scan.nextInt();
        System.out.println("\n");
        
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    
}
/*
Enter a Rows number for the pattern : 8


1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1
*/
