package Result02;

public class Q02 {
    public static void main(String[] args) {
        int number1 = 10, number2 = 15;
        long factorial1 = 1, factorial2 = 1;

        for (int i = 1; i <= number1; i++) {
            factorial1 *= i;
        }

        System.out.println(number1 + "의 팩토리얼 값은 " + factorial1 + "입니다.");
        
        for (int i = 1; i <= number2; i++) {
            factorial2 *= i;
        }

        System.out.println(number2 + "의 팩토리얼 값은 " + factorial2 + "입니다.");
    }
}

//팩토리얼 함수 만들어서 했음.