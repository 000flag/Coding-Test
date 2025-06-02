import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		int n4 = 0; // 같은 수
		int n5 = 0;
		
		int[] ar = new int[3];
		
		ar[0] = n1;
		ar[1] = n2;
		ar[2] = n3;
		
		if (ar[0] == ar[1] && ar[1] == ar[2] && ar[2] == ar[0]) {
			System.out.println(10000 + ar[0] * 1000);
		} else {
			for (int i = 0; i < ar.length;) {
				boolean chk = false;
				
				for (int j = 0; j < ar.length; j++) {
					if (i != j) {
						if (ar[j] == ar[i]) {
							n4 = ar[j];
							chk = true;
							break;
						} else if (ar[j] > ar[i]) {
							n5 = ar[j];
						}
					}
				}
				
				if (chk) {
					break;
				} else {
					i++;
				}
			}
		}
		
		if (n4 > 0) {
			System.out.println(1000 + n4 * 100);
		} else if (n5 > 0) {
			System.out.println(n5 * 100);
		}
		
	}

}