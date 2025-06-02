import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt(); // 금액
		
		if (!(1 <= n1 && n1 <= 1000000000)) {
			return;
		}
		
		int n2 = scan.nextInt(); // 총 개수
		
		if (!(1 <= n2 && n2 <= 100)) {
			return;
		}
		
		int[] ar = new int[n2];
		
		int n5 = 0;
		for (int i = 0; i < ar.length; i++) {
			int n3 = scan.nextInt();
			
			if (!(1 <= n3 && n3 <= 1000000)) {
				return;
			}
			
			int n4 = scan.nextInt();
			
			if (!(1 <= n4 && n4 <= 10)) {
				return;
			}
			
			n5 += n3 * n4;
		}
		
		if (n1 == n5) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
