package academy.devdojo.javaoneforall.javacore.sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    static void main(String[] args) {
        Locale localeBrasil = new Locale("pt", "BR");
        Locale localePortugal = new Locale("pt", "PT");
        Locale localeEUA = new Locale("en", "EUA");
        Calendar calendar = Calendar.getInstance();
        DateFormat dfB = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat dfP = DateFormat.getDateInstance(DateFormat.FULL, localePortugal);
        DateFormat dfE = DateFormat.getDateInstance(DateFormat.FULL, localeEUA);
        System.out.println(dfB.format(calendar.getTime()));
        System.out.println(dfP.format(calendar.getTime()));
        System.out.println(dfE.format(calendar.getTime()));
        System.out.println(localeEUA.getDisplayCountry(localeBrasil));
        System.out.println(localeEUA.getDisplayLanguage(localeBrasil));


    }
}
