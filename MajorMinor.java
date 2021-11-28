package majorminor;
import java.util.Scanner;
public class MajorMinor {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter two characters: ");
        String input = scan.next();
        
        char Subject = Character.toUpperCase(input.charAt(0));
        char status = input.charAt(1);
        
        String CourseName = "", Year = "";
        
        if(Subject == 'M' || Subject == 'C' || Subject == 'I')  {
            
             switch(Subject) {
                case 'M':
                    CourseName = "Mathematics";
                    break;
                case 'C':
                    CourseName = "Computer Science";
                    break;
                case 'I':
                    CourseName = "Information Technology";
                    break;
                default:
                    break;
            }
            
            switch(status)
            {
                case '1':
                    Year = "Freshman";
                    break;
                case '2':
                    Year = "Sophmore";
                    break;
                case '3':
                    Year = "Junior";
                    break;
                case '4':
                    Year = "Senior";
                    break;
                default:
                    break;
            }
            System.out.printf("%s %s%n", CourseName, Year);
        }
        else 
            System.out.println("Wrong Input");
    }  
}
