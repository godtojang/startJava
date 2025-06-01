package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double avg = 0;

        while (true) {
            System.out.print("정수를 입력하세요 (-1을 입력하면 프로그램이 종료 됩니다.) : ");
            int num = scanner.nextInt();

            if (num == -1) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
            sum += num;
            count++;
        }

        avg = (double) sum / count;
        System.out.println("총 합계는 : " + sum);
        System.out.println("평균 값은 : " + avg);

    }
}
