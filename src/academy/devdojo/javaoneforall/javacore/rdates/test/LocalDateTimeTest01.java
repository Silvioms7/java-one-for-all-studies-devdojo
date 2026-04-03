package academy.devdojo.javaoneforall.javacore.rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalTime time = LocalTime.parse("02:53:23");
        LocalDate date = LocalDate.parse("2007-12-04");
        System.out.println(time);
        System.out.println(date);
        LocalDateTime ldt1 = LocalDateTime.of(date, time);
        LocalDateTime ldt2 = date.atTime(time);
        LocalDateTime ldt3 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
    }
}
