package condition;

import java.util.Scanner;

public class CondOp1 {
    public static void main(String[] args) {
//        int age = 18;
//        String status = (age >= 18) ? "성인" : "미성년자";
//        System.out.println("age = " + age + ", status = " + status);
        Scanner scanner = new Scanner(System.in);
        System.out.println("달러를 입력하세요");
        int dollar = scanner.nextInt();

        int won = dollar * 1300;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + won + "원 입니다.");
        }
    }
}