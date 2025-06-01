package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 구구단의 단 수를 입력하세요 : ");
        int x = scanner.nextInt();

        System.out.println(x + "단의 구구단 : ");
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + " X " + i + " = " + x * i);
        }
    }
}
