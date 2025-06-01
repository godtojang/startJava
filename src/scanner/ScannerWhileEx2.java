package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;

        while (true) {
            System.out.print("상품 가격을 입력하세요 (-1을 입력하면 종료됩니다.) : ");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.print("구매할 수량을 입력하세요 : ");
                int quantity = scanner.nextInt();

                totalPrice = price * quantity;
                System.out.println("지불하실 총 금액은 : " + totalPrice + "원 입니다");
            }
        }
    }
}
