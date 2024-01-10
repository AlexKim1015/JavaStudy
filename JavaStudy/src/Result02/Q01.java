package Result02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("국어 점수를 입력해주세요.\n>>> ");
        double koreanScore = scanner.nextDouble();

        System.out.print("영어 점수를 입력해주세요.\n>>> ");
        double englishScore = scanner.nextDouble();

        System.out.print("수학 점수를 입력해주세요.\n>>> ");
        double mathScore = scanner.nextDouble();

        double averageScore = (koreanScore + englishScore + mathScore) / 3;

        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.printf("평균 : %.2f\n", averageScore);
        System.out.printf("등급: %c 등급\n", grade);

        scanner.close();
    }
}

//평균 구할 때 했음. 1월 9일 기준 어제.