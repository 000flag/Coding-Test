import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		
		if ((n1 % 4 == 0 && n1 % 100 != 0) || n1 % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
				
	}

}