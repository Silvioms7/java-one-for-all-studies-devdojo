package academy.devdojo.javaoneforall.javacore.sformatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("2026.04.03 AD at 12:23:06 GMT-03:00"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
