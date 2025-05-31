package day01Quiz;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        int distance;
        Scanner scanner = new Scanner(System.in);
        System.out.print("거리를 입력하세요 : ");
        distance = scanner.nextInt();
        if (distance <= 1) {
            System.out.println("도보를 이용하세요");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요");
        } else {
            System.out.println("비행기를 이용하세요");
        }
    }
}
