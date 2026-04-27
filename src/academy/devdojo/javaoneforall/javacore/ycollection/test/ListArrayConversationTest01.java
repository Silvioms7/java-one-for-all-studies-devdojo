package academy.devdojo.javaoneforall.javacore.ycollection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversationTest01 {
    static void main(String[] args) {
        List<Integer> integersList = new ArrayList<>();
        integersList.add(45);
        integersList.add(54);
        integersList.add(2);
        Integer[] listToArray = integersList.toArray(new Integer[0]);
        System.out.println("Array of integers: " + Arrays.toString(listToArray));

        Integer[] integersArray = new Integer[3];
        integersArray[0] = 5;
        integersArray[1] = 23;
        integersArray[2] = 15;
        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(integersArray));
        System.out.println("List of integers: " + arrayToList);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list3 = List.of(1, 2, 3, 4, 5);
        
    }
}
