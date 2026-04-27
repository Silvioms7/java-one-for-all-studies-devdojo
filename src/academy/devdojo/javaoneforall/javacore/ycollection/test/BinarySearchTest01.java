package academy.devdojo.javaoneforall.javacore.ycollection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(43);
        numeros.add(0);
        numeros.add(042);
        numeros.add(22);
        numeros.add(1);
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 43));
    }
}
