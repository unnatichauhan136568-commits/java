import java.util.Calendar;
import java.util.GregorianCalendar;

public class program38 {
    public static void main(String[] args) {
        
        GregorianCalendar calendar = new GregorianCalendar();

        
        System.out.println("=== Current Calendar Information ===");
        
        int year = calendar.get(Calendar.YEAR);
       
        int month = calendar.get(Calendar.MONTH) + 1; 
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Date: " + day + "/" + month + "/" + year);
        System.out.println("Time: " + hour + ":" + minute + ":" + second);

        
        System.out.println("\n=== Leap Year Check ===");
        if (calendar.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

       
        System.out.println("\n=== Additional Details ===");
        System.out.println("Era: " + (calendar.get(Calendar.ERA) == GregorianCalendar.AD ? "AD" : "BC"));
        System.out.println("Day of Week: " + getDayOfWeekString(calendar.get(Calendar.DAY_OF_WEEK)));
        System.out.println("Day of Year: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week of Year: " + calendar.get(Calendar.WEEK_OF_YEAR));
    }

    
    private static String getDayOfWeekString(int dayOfWeek) {
        String[] days = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[dayOfWeek];
    }
}