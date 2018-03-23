	import java.io.*;
 
 
 
 
import java.math.*;
import java.nio.file.attribute.AclEntry.Builder;
import java.security.KeyStore.Entry;
import java.util.*;
 
 
 
	 
	class codesa {
		private InputStream is;
		private PrintWriter out;
		int time = 0, DP[], start[], end[], dist[],  black[];
		static int MOD = (int)(1e9+7);
		int arr[];
		int weight[][];
		int x[];
		int y[];
		int parent[];
		int MAX = 800000, N, K, L;
		long red[];
		ArrayList<Integer>[] amp;
		HashSet<Integer> hs = new HashSet<>();
		long Dp[][][][] = new long[110][110][12][12];
		public static void main(String[] args) throws Exception 
		{
			new Thread(null, new Runnable() 
			{
			public void run() 
			{
				try {
	 
			//new CODEFORCES().soln();
			} catch (Exception e) 
				{
					System.out.println(e);
				}
			}
		}, "1", 1 << 26).start();
			new Khatri().soln();
		}
		char ch[][]; 
		int n1, n2, k1, k2, M;
		static ArrayList<Integer>[] g;
        static ArrayList<Integer> ar[];
		static long ok[];	 
		static char a[][];
		static int phi[]=new int[500005];
		void solve()
        {
			int test=ni();
			StringBuilder sb=new StringBuilder();
			while(test-->0){
	        int n = ni();
	        char[] a = ns().toCharArray();
            int k=ni();
	        int[] l = new int[n];
	        int[] r = new int[n];
	        int[] f = new int[n];
 
	        Arrays.fill(l, -1);
	        Arrays.fill(r, -1);
 
	        for (int i = 0; i < n; i++) {
	            if (i > 0)
	                l[i] = l[i-1];
	            if (a[i] == 'P')
	                l[i] = i;
	        }
 
	        for (int i = n-1; i >= 0; i--) {
	            if (i < n-1)
	                r[i] = r[i+1];
	            if (a[i] == 'P')
	                r[i] = i;
	        }
 
	        int ll = 0;
	        int rr = 2*n;
	        int ans = -1;
 
	        while (ll <= rr) {
 
	            int m = (ll+rr)/2;
	            int time = m;
	            boolean good = true;
	            Arrays.fill(f, 0);
	            int prev = 0;
	            for (int i = 0; i < n; i++) {
	                boolean ok = false;
	                if (a[i] == '*') {
	                    if (l[i] != -1) {
	                        int t = Math.min(f[l[i]], i - l[i]) * 2 + Math.max(f[l[i]], i - l[i]);
	                        if (m - t >= 0)
	                            ok = true;
	                    }
 
	                    if (!ok) {
	                        if (r[i] != -1 && r[i]-i <= m) {
	                            ok = true;
	                            f[r[i]] = Math.max(f[r[i]], r[i]-i);
	                            i = r[i];
	                        }
	                    }
 
	                    if (!ok) {
	                        good = false;
	                        break;
	                    }
	                }
	            }
 
	            //System.err.println(good+" "+time);
 
	            if (good) {
	                rr = time - 1;
	                ans = time;
	            }
	            else {
	                ll = time + 1;
	            }
	            }
	        sb.append(Integer.toString(ans));
	        out.print(sb);
        }
				
		
		private static long find(int v,int start,int end,int l,int r)
    	{
    	    if(r < start || end < l)
    	    {
    	    	return Long.MAX_VALUE;
    	    }
    	    if(l <= start && end <= r)
    	    {
    	        return (tre[v]);
    	    }
    	    int mid = (start + end) / 2;
    	    long p1 = find(2*v, start, mid, l, r);
    	    long p2 = find(2*v+1, mid+1, end, l, r);
    	    return Math.min(p1, p2);          
    	}
		static long tre[]=new long[8000005];
		public static void Update(int v,int tl,int tr,int index,long val)
    	{
    		if(tl==tr)
    		{
    			tre[v]=val;
    		}
    		else
    		{
    			int mid=(tl+tr)/2;
    			if(tl <= index &&index <= mid)
    	        {
    	            Update(2*v,tl, mid, index, val);
    	        }
    	        else
    	        {
    	        	Update(2*v+1,mid+1,tr, index, val);
    	        }
    			tre[v]=(Math.min(tre[2*v],tre[2*v+1]));
    		}
    	}
		
			
		
		
		
        
		
		
	    
		
              
       
 
       
       
            boolean isPrime(int x)
            {
            if(x==0||x==1)
            	return false;
			for(int i = 2;i*1L*i<=x;i++) if(x%i==0) return false;
			return true;
		}
	    int  p ;
		void buildGraph(int n)
		{
			for(int i = 0; i<n ;i++){
				int x1 = ni() -1, y1 = ni()-1;
				amp[x1].add(y1);
				amp[y1].add(x1);
				x[i] = x1; y[i] = y1;
			}
		}
		long get(int x){
			long val = 0;
			for(int i = 0; i< N; i++){
				val += Math.abs(x-arr[i]);
				x+=L;
			}
			return val;
		}
		
		long modInverse(long a, long mOD2){
	        return  power(a, mOD2-2, mOD2);
		}
		long power(long x, long y, long m)
		{
			if (y == 0)
	    return 1;
		long p = power(x, y/2, m) % m;
		p = (p * p) % m;
	 
		return (y%2 == 0)? p : (x * p) % m;
		}
		
		public static long gcd(long a, long b){
			if(b==0) return a;
			return gcd(b,a%b);
		}
		
		public static int[] shuffle(int[] a, Random gen){
			for(int i = 0, n = a.length;i < n;i++)
			{ 
				int ind = gen.nextInt(n-i)+i; 
				int d = a[i]; 
				a[i] = a[ind];
				a[ind] = d; 
			} 
		return a; 
		}
		class Pair2 implements Comparable<Pair2>{
			long a;
			long b;
			long c;
			Pair2(long x,long y,long z){
			this.a=x;
			this.b=y;
			this.c=z;
			}
			public int hashCode() {
				return Objects.hash();
			}
			
			@Override
			public int compareTo(Pair2 arg0) {
				return (int)(arg0.b-b);
			}
			
		}
		
		class Pair1 implements Comparable<Pair1>{
			long a;
			long b;
			long c;
			Pair1(long x,long y,long z){
			this.a=x;
			this.b=y;
			this.c=z;
			}
			public int hashCode() {
				return Objects.hash();
			}
			
			@Override
			public int compareTo(Pair1 arg0) {
				return (int)(arg0.c-c);
			}
			
		}
		long power(long x, long y, int mod){
			long ans = 1;
			while(y>0){
				if(y%2==0){
					x = (x*x)%mod;
					y/=2;
				}
				else{
					ans = (x*ans)%mod;
					y--;
				}
			}
			return ans;
		}
		void soln() {
			is = System.in;
			out = new PrintWriter(System.out);
			long s = System.currentTimeMillis();
			solve();
            out.flush();
		}
 		private byte[] inbuf = new byte[1024];
		public int lenbuf = 0, ptrbuf = 0;
	 
		private int readByte() {
			if (lenbuf == -1)
				throw new InputMismatchException();
			if (ptrbuf >= lenbuf) {
				ptrbuf = 0;
				try {
					lenbuf = is.read(inbuf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return -1;
			}
			return inbuf[ptrbuf++];
		}
	 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
	 
		private int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b))
				;
			return b;
		}
	 
		private double nd() {
			return Double.parseDouble(ns());
		}
	 
		private char nc() {
			return (char) skip();
		}
		private String ns() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while (!(isSpaceChar(b))) { 
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		private char[] ns(int n) {
			char[] buf = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buf[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buf : Arrays.copyOf(buf, p);
		}
		private int[][] nm(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++)
			{
				for(int j=0;j<m;j++)
					map[i][j]=ni();
			}
			return map;
		}
	 
		private int[] na(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = ni();
			return a;
		}
	 
		private int ni() {
			int num = 0, b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
	 
			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}
	 
		private long nl() {
			long num = 0;
			int b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
	 
			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}
	 
		private boolean oj = System.getProperty("ONLINE_JUDGE") != null;
	 
		private void tr(Object... o) {
			if (!oj)
				System.out.println(Arrays.deepToString(o));
		}
	} 