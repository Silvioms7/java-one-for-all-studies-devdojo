package academy.devdojo.javaoneforall.javacore.rdates.test;

import java.util.Calendar;

public class CalendarTest01 {
    static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Yes, first Day of week is Sunday");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
    }
}
