package academy.devdojo.javaoneforall.javacore.rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    static void main(String[] args) {
        LocalDateTime birthdate = LocalDateTime.of(2007, Month.DECEMBER, 4, 13,43,34);
        System.out.println("Dias de vida: "+ChronoUnit.DAYS.between(birthdate, LocalDateTime.now()));
        System.out.println("Semanas de vida: "+ChronoUnit.WEEKS.between(birthdate, LocalDateTime.now()));
        System.out.println("Meses de vida: "+ChronoUnit.MONTHS.between(birthdate, LocalDateTime.now()));
        System.out.println("Anos de vida: "+ChronoUnit.YEARS.between(birthdate, LocalDateTime.now()));
    }
}
