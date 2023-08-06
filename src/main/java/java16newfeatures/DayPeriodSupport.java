package java16newfeatures;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriodSupport {
    public static void main(String[] args) {
        LocalTime date = LocalTime.parse("02:25:08.690791");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
        System.out.println(formatter.format(date));
    }
}
