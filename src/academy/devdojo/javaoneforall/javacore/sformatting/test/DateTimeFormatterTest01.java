package academy.devdojo.javaoneforall.javacore.sformatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20260406", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-04-06-03:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-04-06", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2026-04-06T15:15:54.4311573",DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBrasil = LocalDate.now().format(formatterBrasil);
        System.out.println(formatBrasil);
        LocalDate parseBrasil = LocalDate.parse("06/04/2026", formatterBrasil);
        System.out.println(parseBrasil);

        DateTimeFormatter formatterTest = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRENCH);
        String formatTest = LocalDate.now().format(formatterTest);
        System.out.println(formatTest);
        LocalDate parseTest = LocalDate.parse("06.avril.2026", formatterTest);
        System.out.println(parseTest);
    }
}
