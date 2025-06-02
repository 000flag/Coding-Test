import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		// 시
		if (!(0 <= n1 && n1 < 25)) {
			return;
		}		
		
		// 분
		if (!(0 <= n2 && n2 < 61)) {
			return;
		}
		
		if (n2 < 45) {
			if (n1 == 0) {
				n1 = 23;
			} else {
				n1 -= 1;
			}
		}
		
		n2 -= 45;
		
		if (n2 < 0) {
			n2 = n2 + 60;
		}

		System.out.println(n1);
		System.out.println(n2);
		
	}

}
