import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		
		int n1 = B % 10;
		int n2 = (B % 100) / 10;
		int n3 = B / 100;
		
		n1 = n1 * A;
		n2 = n2 * A;
		n3 = n3 * A;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n1 + n2 * 10 + n3 * 100);
	}

}
