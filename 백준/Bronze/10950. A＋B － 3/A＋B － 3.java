import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt(); // 테스트 케이스
		
		int[] ar = new int[n1];
		
		for (int i = 0; i < ar.length; i++) {
			int n2 = scan.nextInt();
			int n3 = scan.nextInt();
			
			if (!(0 < n2 && n2 < 10)) {
				return;
			}
			
			if (!(0 < n3 && n3 < 10)) {
				return;
			}
			
			System.out.println(n2 + n3);
		}
	}

}