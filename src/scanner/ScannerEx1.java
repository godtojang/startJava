package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요 : ");
        String foodName = scanner.next();

        System.out.print("가격을 입력해주세요 : ");
        int foodPrice = scanner.nextInt();

        System.out.print("수량을 입력해주세요 : ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + "을(를)" + foodQuantity + "개 주문하셨습니다. 총 가격은 : " + totalPrice + "원 입니다.");
    }
}
