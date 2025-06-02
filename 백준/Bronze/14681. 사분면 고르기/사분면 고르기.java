import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if (n1 >= 0 && n2 >= 0) {
			System.out.println("1");
		} else if (n1 >= 0 && n2 <= 0) {
			System.out.println("4");
		} else if (n1 <= 0 && n2 >= 0) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
				
	}

}
