import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    
    public static void main(String[] args) {
        
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateNow = date.format(formatter);
        System.out.println(dateNow);

        LocalDateTime date1 = LocalDateTime.of(2025, 12, 25, 12, 00, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 12, 25, 12, 00, 0);
        if(date1.isEqual(date2)){
            System.out.println(date1 +"  is equal to " + date2);
        }
        else if( date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if( date1.isAfter(date2)){
            System.out.println(date1 + " is later than " + date2);
        }

    }
}
