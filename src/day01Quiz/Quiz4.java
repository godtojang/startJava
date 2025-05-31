package day01Quiz;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("max 값을 입력하세요 : ");
        int max = scanner.nextInt();
        int i = 0;
        int sum = 0;

//        for (i = 1; i <= max; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        while (max >= i) {
            sum += i;
            i += 1;
        }
        System.out.println(sum);
    }
}
