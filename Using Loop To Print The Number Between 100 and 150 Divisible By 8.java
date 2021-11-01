package using.loop.to.print.the.number.between.pkg100.and.pkg150.divisible.by.pkg8;
public class UsingLoopToPrintTheNumberBetween100and150DivisibleBy8 {
    public static void main(String[] args) {
        int n = 150;
        
        while(n <= 150 && n>= 100) {
            if(n % 8 == 0) {
                System.out.println(n +" ");
            }
        n--;
        }
    }
}
