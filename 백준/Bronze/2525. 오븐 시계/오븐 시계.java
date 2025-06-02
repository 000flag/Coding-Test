import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt(); // 필요 시간
		
		// 시
		if (!(0 <= n1 && n1 <= 23)) {
			return;
		}		
		
		// 분
		if (!(0 <= n2 && n2 <= 59)) {
			return;
		}
		
		// 필요 시간
		if (!(0 <= n3 && n3 <= 1000)) {
			return;
		}
		
		int n4 = n3 / 60; // 시간
		int n5 = n3 % 60; // 나머지 
		
		n1 = n1 + n4;
		n2 = n2 + n5;
		
		if (n2 >= 59) {
			n1++;
			n2 = n2 - 60;
		}
		
		if (n1 >= 24) {
			int n7 = n1 % 24;
			
			n1 = 0;
			
			n1 = n1 + n7;
		}	

		System.out.println(n1);
		System.out.println(n2);
	}

}