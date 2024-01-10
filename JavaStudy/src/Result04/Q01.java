package Result04;

import ch05_controll.LoopWhile;

public class Q01 {

	public static void main(String[] args) {
		// 1 ~ 50 사이의 랜덤함수 생성
		for(int i = 1; i <= 50; i++) {
			int randInt = (int) (Math.random() * 50 + 1);
			System.out.println(randInt);
		}

	}
	
	
/*
public class Q01 {
	public static void main(String[] args) {
		// 1 ~ 50 사이의 랜덤함 수 생성
		// 업다운 게임을 만들어보세요^^
		int chance = 5;
		int randInt = (int) (Math.random() * 50 + 1);
		while(true){
			if(chance == 0) {
				break;
			}
			System.out.println(randInt);
			chance--;
		}
	}
}
*/