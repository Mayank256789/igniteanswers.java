import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date1 {
    public void time(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year:");
        int Y = scanner.nextInt();
        System.out.print("Enter month:");
        int M = scanner.nextInt();
        System.out.print("Enter day :");
        int D = scanner.nextInt();
        System.out.print("Enter hour(0-23):");
        int hour = scanner.nextInt();
        System.out.print("Enter minute(0-59):");
        int minute = scanner.nextInt();
        System.out.print("Enter second(0-59):");
        int second = scanner.nextInt();

        System.out.print("Enter year");
        int Y1 = scanner.nextInt();
        System.out.print("Enter month");
        int M1 = scanner.nextInt();
        System.out.print("Enter day");
        int D1 = scanner.nextInt();
        System.out.print("Enter hour(0-23)");
        int hour1 = scanner.nextInt();
        System.out.print("Enter minute(0-59)");
        int minute1 = scanner.nextInt();
        System.out.print("Enter second(0-59)");
        int second1 = scanner.nextInt();
        LocalDateTime customdate = LocalDateTime.of(Y,M,D,hour,minute,second);
        LocalDateTime customdate1 = LocalDateTime.of(Y1,M1,D1,hour1,minute1,second1);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        String date1 = customdate.format(formatter);
        System.out.println(date1);
        String date2 = customdate1.format(formatter1);
       System.out.println(date2);
        DateTimeFormatter formatter12 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String date12 = customdate1.format(formatter12);
        System.out.println(date12);
        String dayofweek2 = customdate1.getDayOfWeek().toString();
        dayofweek2 = dayofweek2 ;
        System.out.println(dayofweek2);
        if(dayofweek2.equals("Sunday")||dayofweek2.equals("Saturday")){
            System.out.println("OUTDOOR");
        }
        else{
            System.out.println("INDOOR");
        }
        Duration duration = Duration.between(customdate,customdate1);

        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        long days = absSeconds / (24 * 3600);
        long hours = (absSeconds % (24 * 3600)) / 3600;
        long minutes = (absSeconds % 3600) / 60;
        long secs = absSeconds % 60;
        Period period = Period.between(customdate.toLocalDate(), customdate1.toLocalDate());

        System.out.println("Difference is: " + period.getYears() + " years, "
                + period.getMonths() + " months, "
                + period.getDays() + " days, "
                + hours + " hours, "
                + minutes + " minutes, "
                + secs + " seconds.");


    }
}
