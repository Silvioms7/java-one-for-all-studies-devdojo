// 03/14/2026
package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements03 {
    static void main(String[] args) {
        double salary = 100000D;
        String shouldBuyMessage = "Buy car Fiat Fastback!";
        String shouldNotBuyMessage = "Don't buy car Fiat Fastback!";
        String showMessage = salary >= 120000 ? shouldBuyMessage : shouldNotBuyMessage;
        System.out.println(showMessage);
    }
}
