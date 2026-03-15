package academy.devdojo.javaoneforall.introduction;

public class Class08MultiArrays01 {
    static void main(String[] args) {
        String [][] monDays = new String[12][2];
        monDays [0][0] = "Jan"; monDays [0][1] = "31";
        monDays [1][0] = "Feb"; monDays [1][1] = "28";
        monDays [2][0] = "Mar"; monDays [2][1] = "31";
        monDays [3][0] = "Apr"; monDays [3][1] = "30";
        monDays [4][0] = "May"; monDays [4][1] = "31";
        monDays [5][0] = "Jun"; monDays [5][1] = "30";
        monDays [6][0] = "Jul"; monDays [6][1] = "31";
        monDays [7][0] = "Aug"; monDays [7][1] = "31";
        monDays [8][0] = "Sep"; monDays [8][1] = "30";
        monDays [9][0] = "Oct"; monDays [9][1] = "31";
        monDays [10][0] = "Nov"; monDays [10][1] = "30";
        monDays [11][0] = "Dec"; monDays [11][1] = "31";

            for (int j = 0; j < monDays.length; j++) {
                System.out.println(monDays[j][0] + " = " + monDays[j][1]);
            }

        System.out.println("---------------------------------------------------");

        for (String[] baseArrays : monDays) {
            System.out.println("\n ---------------");
            for (String day : baseArrays) {
                System.out.print(day + " = ");
            }
        }

    }
}
