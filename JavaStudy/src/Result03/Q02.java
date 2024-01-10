package Result03;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // 사용자로부터 문자열 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("거꾸로 뒤집을 문자열 입력: ");
        String inputString = scanner.nextLine();

        // 뒤집은 결과 계산 및 출력
        String reversedString = reverse(inputString);
        System.out.println("뒤집은 결과: " + reversedString);

        // Scanner 닫기
        scanner.close();
    }

    // 문자열을 뒤집는 메소드
    public static String reverse(String input) {
        // StringBuilder를 사용하여 문자열 뒤집기
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        return reversed.toString();
    }
}