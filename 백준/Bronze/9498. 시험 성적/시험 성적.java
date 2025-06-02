import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		
		if (n1 >= 90) {
			System.out.println("A");
		} else if (n1 >= 80) {
			System.out.println("B");
		} else if (n1 >= 70) {
			System.out.println("C");
		} else if (n1 >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
				
	}

}
