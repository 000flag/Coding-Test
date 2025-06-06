import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n1 = Integer.parseInt(br.readLine());
			
			if (!(0 <= n1 && n1 <= 1000000)) {
				return;
			}
					
			int n2 = 0;
			for (int i = 0; i < n1; i++) {
				String str = br.readLine();
				String[] res = str.split(" ");
				n2 = 0;
				
				for (String s : res) {
					n2 += Integer.parseInt(s);
				}
				
				bw.write(String.valueOf(n2));
				bw.newLine();
			}
			
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
        }
 	}

}
