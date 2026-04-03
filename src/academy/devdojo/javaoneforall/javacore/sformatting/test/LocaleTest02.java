package academy.devdojo.javaoneforall.javacore.sformatting.test;

import java.util.Locale;

public class LocaleTest02 {
    static void main(String[] args) {
        System.out.println(Locale.getDefault());
        for (String isoCountry : Locale.getISOCountries()) {
            System.out.print(isoCountry + " ");
        }
        System.out.println();
        for (String isoLanguage : Locale.getISOLanguages()) {
            System.out.print(isoLanguage + " ");
        }


    }
}
