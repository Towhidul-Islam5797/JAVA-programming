package mathodtotable;
public class MathodToTable {
    public static double FootToMeter(double foot) {
        return 0.305 * foot;
    }
    public static double MeterToFoot(double meter) {
        return 3.279 * meter;
    }
    public static void main(String[] args) {
        
        System.out.println("\nFeet     Meters     |     Meters     Feet\n" + "----------------------------------------------");
        
        for (double foot = 1.0, meter = 20.0; foot <= 10.0 ; foot++, meter += 5) {
            System.out.printf("%4.1f     ", foot);
            System.out.printf("%6.3f", FootToMeter(foot));
            System.out.print("     |     ");
            System.out.printf("%-11.1f", meter);
            System.out.printf("%7.3f\n", MeterToFoot(meter));
	}
    }
}
