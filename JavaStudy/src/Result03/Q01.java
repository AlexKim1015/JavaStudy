package Result03;

public class Q01 {

    public static void main(String[] args) {
        // 룰렛이 돌아간 각도
        double rotatedAngle = 5834;

        // 바퀴 수 계산
        int totalRevolutions = (int) (rotatedAngle / 360);

        // 남은 각도 계산
        double remainingAngle = rotatedAngle % 360;

        // 경품 조건에 따라 출력
        String prize = calculatePrize(remainingAngle);

        // 결과 출력
        System.out.println(prize);
        System.out.println("총 " + totalRevolutions + "바퀴 돌았습니다.");
    }

    // 각도에 따른 경품을 계산하는 메소드
    public static String calculatePrize(double angle) {
        if (angle >= 0 && angle < 60) {
            return "사탕";
        } else if (angle >= 60 && angle < 120) {
            return "초콜릿";
        } else if (angle >= 120 && angle < 180) {
            return "쿠키";
        } else if (angle >= 180 && angle < 240) {
            return "콜라";
        } else if (angle >= 240 && angle < 300) {
            return "아이스크림";
        } else if (angle >= 300 && angle < 360) {
            return "커피";
        } else {
            return "올바른 각도 범위가 아닙니다.";
        }
    }
}