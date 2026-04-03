package academy.devdojo.javaoneforall.javacore.rdates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        LocalTime time = LocalTime.of(4,22,01);
        System.out.println(timeNow);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
