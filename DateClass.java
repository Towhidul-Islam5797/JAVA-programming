//Sting program for current time format
package dateclass;

import java.text.*;
import  java.util.*;
import java.time.*;

public class DateClass {
    public static void main(String[] args) {
        
        Date date = new Date();
        
        LocalDateTime d = LocalDateTime.now();
        
        ZonedDateTime UTCtime = d.atZone(ZoneId.of("UTC"));
        //"d" is the current date and
        //"ZonedDateTime" accepts "d" as UTC
        //"atZone" specifies the time zone
        
        System.out.println("The universal time is : " + UTCtime);
        System.out.println("The local time is     : " + d);
        
        
    }
    
}
