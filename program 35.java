import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class p035 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("--- Displaying Date in Different Formats ---");

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("1. yyyy-MM-dd : " + currentDate.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("2. dd/MM/yyyy : " + currentDate.format(formatter2));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("3. MM-dd-yyyy : " + currentDate.format(formatter3));

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        System.out.println("4. Full Date  : " + currentDate.format(formatter4));

        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
        System.out.println("5. Date & Time: " + currentDateTime.format(formatter5));
    }
}