package Result02;

public class Q04 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

/*
String star= "*****";
for(int i = 5 ; i > 0; i--){
	String subStar = star.substring(0, i);
	System.out.println(subStar);
}
*/