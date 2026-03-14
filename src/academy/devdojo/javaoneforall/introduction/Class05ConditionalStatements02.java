// 03/14/2026
package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements02 {
    static void main(String[] args) {
        byte age = 17;
        String category;
//        if (age < 15) {
//            category = "Category = junior!";
//        } else if (age >= 15 && age < 18) {
//            category = "Category = senior!";
//        } else {
//            category = "Category = masters!";
//        }
        category = age < 15 ? "Category = junior!" : age >= 15 && age < 18 ?
                "Category = senior!" : "Category = masters!";
        System.out.println(category);
    }
}
