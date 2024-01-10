package Result01;

public class Q02 {

	public static void main(String[] args) {
		String enigma = "너오구늘리뭐너먹구지리";
		String first = enigma.replace("너", "");
		String second = first.replace("구", "");
		String third = second.replace("리", "");
		if (third == "오늘뭐먹지") {
			System.out.println("해독완료!! =>" + third);
		}
		System.out.println("1차 암호 해독[너 제거]: " + first);
		System.out.println("2차 암호 해독[구 제거]: " + second);
		System.out.println("3차 암호 해독[리 제거]: " + third);
		
		
		
	}

}

