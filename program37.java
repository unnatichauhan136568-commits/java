import java.util.Calendar;
import java.text.SimpleDateFormat;

public class program37 {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        
       
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("=== Original Date & Time ===");
        System.out.println(sdf.format(calendar.getTime()) + "\n");

        System.out.println("=== Performing Additions & Subtractions ===");

        
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After adding 10 days:      " + sdf.format(calendar.getTime()));

       
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("After subtracting 5 days:  " + sdf.format(calendar.getTime()));

       
        calendar.add(Calendar.MONTH, 3);
        System.out.println("After adding 3 months:     " + sdf.format(calendar.getTime()));

       
        calendar.add(Calendar.MONTH, -2);
        System.out.println("After subtracting 2 months: " + sdf.format(calendar.getTime()));
    }
}