package Result03;

public class Q03 {

    public static void main(String[] args) {
        // 정상적인 방향의 5층 트리 출력
        System.out.println("정상적인 방향의 5층 트리:");
        printChristmasTree(5);

        // 거꾸로 된 5층 트리 출력
        System.out.println("\n거꾸로 된 5층 트리:");
        printReverseChristmasTree(5);
    }

    // 정상적인 방향의 크리스마스 트리 출력 메소드
    public static void printChristmasTree(int height) {
        for (int i = 0; i < height; i++) {
            // 공백 출력
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            // 별표 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
    }

    // 거꾸로 된 크리스마스 트리 출력 메소드
    public static void printReverseChristmasTree(int height) {
        for (int i = height - 1; i >= 0; i--) {
            // 공백 출력
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            // 별표 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}