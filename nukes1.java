import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
 
public class nukes1 {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();
		PrintWriter pr = new PrintWriter(System.out);
		int A = fr.nextInt();
		int n = fr.nextInt();
		int k = fr.nextInt();
		int a[] = new int[k];
		Arrays.fill(a,0);
		for(int i=0;i<k;i++){
			a[i] = A % (n+1);
			A = A/(n+1);
			pr.print(a[i]+" ");
		}
		pr.println();
		pr.close();
	}
 
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}  