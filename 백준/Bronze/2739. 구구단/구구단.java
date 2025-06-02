import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		
		if (!(0 < n1 && n1 < 10)) {
			return;
		}
		
		for (int i = 1; i < 10; i++) {
			System.out.println(String.format("%s * %s = %s", n1, i, (n1 * i)));
		}
	}

}