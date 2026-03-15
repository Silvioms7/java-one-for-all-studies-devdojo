package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays02 {
    static void main(String[] args) {
        // byte, short, int, double, float, long = 0
        // char = '\u0000' ''
        // boolean = false
        // String = null
        String[] names = new String[4];
        names [0] = "Jesus";
        names [1] = "Silvio";
        names [2] = "Fulano";
        names [3] = "Sla";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names [i]);
        }
    }
}
