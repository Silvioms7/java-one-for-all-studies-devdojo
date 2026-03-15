package academy.devdojo.javaoneforall.introduction;

public class Class08MultiArrays02 {
    static void main(String[] args) {
        int [][] arrays = new int[3][];

        arrays[0] = new int[2];
        arrays[1] = new int[]{1, 2, 3};
        int [][] arrays2 = {{4},{5},{6}};

        for (int[] baseArray : arrays2) {
            System.out.println(baseArray);
            for (int num : baseArray) {
                System.out.println(num);
            }
        }
    }
}
