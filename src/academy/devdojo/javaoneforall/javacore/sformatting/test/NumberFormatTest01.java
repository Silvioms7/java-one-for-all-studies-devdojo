package academy.devdojo.javaoneforall.javacore.sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double value = 100_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value));

        }
        String stringValue = "53_453,321".replace("_", "");
        try {
            System.out.println(nfa[2].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
