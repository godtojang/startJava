package array;

public class ArrayQuiz {
    public static void main(String[] args) {
//        int student1 = 90;
//        int student2 = 80;
//        int student3 = 70;
//        int student4 = 60;
//        int student5 = 50;
//
//        int total = student1 + student2 + student3 + student4 + student5;
//        double average = (double) total / 5;
//
//        System.out.println("점수 총합: " + total);
//        System.out.println("점수 평균: " + average);
//
        int[] student = {90, 80, 70, 60, 50, 40, 30, 20};

        int total = 0;

        for (int i = 0; i < student.length; i++) {
            total += student[i];
        }
        double avg = (double) total / student.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}