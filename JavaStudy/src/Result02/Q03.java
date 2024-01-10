package Result02;

public class Q03 {
    public static void main(String[] args) {
        String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";

        int count = 0;
        int index = findWally.indexOf("월리");
        while (index != -1) {
            count++;
            index = findWally.indexOf("월리", index + 2);
        }

        System.out.println("월리가 " + count + "번 나타납니다.");
    }
}

/*1. 문자열 길이 이용
int all = findWally.length();
int after = findWally.replaceAll("월리", "").length();
System.out.println((all - after) / 2);
2. 동일한 문자열 수
int cnt = 0;
for(int i =0; i < findWally.length()-1;i++){
	String subWally = findWally.substring(i, i+2);
	if(subWally.equals("월리")){
		cnt ++1;
	}
}
System.out.println("월리는?" + cnt);
*/