
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class tatti {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t,n;
		String s;
		
		t = Integer.parseInt(br.readLine());
		for (;t>0;t--) {
			n = Integer.parseInt(br.readLine());
			s = "";
			for (int i = 0; i < n; i++) {
				s+=(char)('a' + i%3);
			}
			System.out.println(s);
		}
	}
}