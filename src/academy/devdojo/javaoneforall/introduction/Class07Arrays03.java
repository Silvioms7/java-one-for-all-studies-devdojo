package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays03 {
    static void main(String[] args) {
        int[] numbers = new int[3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers: " + numbers [i]);
        }

        System.out.println("-----------------------------------");

        int[] numbers2 = {1,2,3,4};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("numbers2: " + numbers2[i]);
        }

        System.out.println("-----------------------------------");

        int []  numbers3 = new int[] {1,2,3,4,5};
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println("numbers3: " + numbers3[i]);
        }

        System.out.println("-----------------------------------");

        int [] numbers4 = {12,34,56,78};
        for (int num : numbers4) {
            System.out.println(num);
        }
    }
}
