import java.io.*;
import java.util.*;
 
class POLYEVAL {
	static int M = 786433, N = 1 << 18;	// M == N * 3 + 1
	static int r1 = 41, r2 = mul(r1, r1), r3 = mul(r1, r2);
	static int add(int a, int b) { return (a + b) % M; }
	static int sub(int a, int b) { return (a - b + M) % M; }
	static int mul(int a, int b) { return (int) ((long) a * b % M); }
	static int pow(int a, int k) {
		if (k == 0)
			return 1;
		int p = pow(a, k / 2);
		p = mul(p, p);
		if (k % 2 == 1)
			p = mul(p, a);
		return p;
	}
	static void fft(int[] aa) {
		for (int i = 1, j = 0; i < N; i++) {
			int k;
			for (k = N >> 1; k <= j; k >>= 1)
				j -= k;
			j += k;
			if (i < j) {
				int tmp = aa[i];
				aa[i] = aa[j];
				aa[j] = tmp;
			}
		}
		for (int n = 2; n <= N; n <<= 1) {
			int g = r3;
			for (int i = n; i < N; i <<= 1)
				g = mul(g, g);
			for (int i = 0; i < N; i += n) {
				int p = 1;
				for (int j = 0; j < n / 2; j++) {
					int k = i + j, l = k + n / 2;
					int u = aa[k], v = mul(aa[l], p);
					aa[k] = add(u, v);
					aa[l] = sub(u, v);
					p = mul(p, g);
				}
			}
		}
	}
	static void magic() {
		for (int i = 2; i < 100; i++) {
			int p2 = pow(i, (M - 1) / 2);
			int p3 = pow(i, (M - 1) / 3);
			System.out.println(i + " : " + p2 + " " + p3);
			if (p2 != 1 && p3 != 1)
				break;
		}
	}
	public static void main(String[] args) throws IOException {
		//magic();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] aa = new int[N];
		int[] bb = new int[N];
		int[] cc = new int[N];
		int[] pp = new int[M];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i <= n; i++) {
			aa[i] = Integer.parseInt(st.nextToken());
			bb[i] = mul(aa[i], pow(r1, i));
			cc[i] = mul(aa[i], pow(r2, i));
		}
		pp[0] = aa[0];
		fft(aa);
		fft(bb);
		fft(cc);
		for(int p = 1, i = 0; i < N; i++) {
			pp[p] = aa[i];
			p = mul(p, r1);
			pp[p] = bb[i];
			p = mul(p, r1);
			pp[p] = cc[i];
			p = mul(p, r1);
		}
		int k = Integer.parseInt(br.readLine());
		PrintWriter pw = new PrintWriter(System.out);
		for(int i = 0; i < k; i++) {
			int x = Integer.parseInt(br.readLine());
			pw.println(pp[x]);
		}
		pw.close();
	}
}