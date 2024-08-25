import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args) {
        String startDay = "mon";
        int n = 13;
        System.out.println(countSundays(startDay, n));
    }

    public static int countSundays(String startDay, int n) {
        Map<String, Integer> dayIndex = new HashMap<>();
        dayIndex.put("sun", 0);
        dayIndex.put("mon", 1);
        dayIndex.put("tue", 2);
        dayIndex.put("wed", 3);
        dayIndex.put("thu", 4);
        dayIndex.put("fri", 5);
        dayIndex.put("sat", 6);

        int startIndex = dayIndex.get(startDay.toLowerCase());
        int daysToFirstSunday = (7 - startIndex) % 7;

        if (daysToFirstSunday == 0) {
            daysToFirstSunday = 7;
        }

        if (n < daysToFirstSunday) {
            return 0;
        }

        int remainingDays = n - daysToFirstSunday;
        int totalSundays = 1 + (remainingDays / 7);

        return totalSundays;
    }
}
