import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public void time(){
        System.out.println( System.currentTimeMillis()/1000/3600/8765);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        //System.out.println(formatter);
        String myDate = now.format(formatter);
        String myTime = now.format(formatter2);
        String myTime1 = now.format(formatter3);
        System.out.println(myDate);
        System.out.println(myTime);
        System.out.println(myTime1);
        DateTimeFormatter formater4 = DateTimeFormatter.ofPattern("HH:MM:SS");
        String myTime2 = now.format(formater4);
        System.out.println(myTime2);

    }
}
