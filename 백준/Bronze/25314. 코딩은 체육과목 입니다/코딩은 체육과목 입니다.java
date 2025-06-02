import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		
		if(!(4 <= n1 && n1 <= 1000)) {
			return;
		}
		
		if (n1 % 4 != 0) {
			return;
		}
		
		int n2 = n1 / 4;
		
		int[] ar = new int[n2];
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ar.length; i++) {
			sb.append("long ");
		}
		
		sb.append("int");
		
		System.out.println(sb.toString());
 	}

}