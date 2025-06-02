import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		
		if (!(1 <= n1 && n1 <= 10000)) {
			return;
		}
		
		int n2 = 0;
		
		for (int i = 0; i <= n1; i++) {
			n2 += i;
		}
		
		System.out.println(n2);
	}

}
