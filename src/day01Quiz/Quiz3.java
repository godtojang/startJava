package day01Quiz;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("x = " + x + ", 짝수");
        } else {
            System.out.println("x = " + x + ", 홀수");
        }
    }
}
