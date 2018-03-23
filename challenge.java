import java.util.Scanner;
import java.lang.Math;
import java.util.*;
 
class challenge 
{
	static Long[] s = new Long[2];
	static Long xorshift128plus() 
	{
		Long x = s[0];
		final Long y = s[1];
		x ^= x << 23;
		s[1] = x ^ y ^ (x >>> 17) ^ (y >>> 26);
		return s[0] = y;
	}
	
	static final int MX = 1000;
	static int[][] C = new int[MX][MX];
	static int[][] H = new int[MX][MX];
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 0; t < T; t++) 
		{
			int n = scan.nextInt();
			int Cmax = scan.nextInt();
			int Hmax = scan.nextInt();
			for (int i = 0; i < n; i++) 
			{
				C[i][i] = 0;
				String seed1 = scan.next();
				String seed2 = scan.next();
				s[0] = Long.parseUnsignedLong(seed1);
				s[1] = Long.parseUnsignedLong(seed2);
				for (int j = i + 1; j < n; j++) 
				{
					Long value = Long.remainderUnsigned(xorshift128plus(), Cmax + 1);
					C[i][j] = C[j][i] = Math.toIntExact(value);
				}
			}
			
			for (int i = 0; i < n; i++) 
			{
				String seed1 = scan.next();
				String seed2 = scan.next();
				s[0] = Long.parseUnsignedLong(seed1);
				s[1] = Long.parseUnsignedLong(seed2);
				for (int j = 0; j < n; j++) 
				{
					Long value = Long.remainderUnsigned(xorshift128plus(), Hmax + 1);
					H[i][j] = Math.toIntExact(value);
				}
			}
			int A[][]=new int[n][n];
			for(int f=0;f<n;f++)
			{
				for(int g=0;g<n;g++)
				{
					A[f][g]=0;
				}
				//System.out.println("");
			}
			if(n%2==0)
			{
				for(int g=0;g<n/2;g++)
				{
					HashMap<Integer, ArrayList<Integer>> indexMap = new HashMap<Integer, ArrayList<Integer>>();
					int B[]=new int[n-1-g];
					int p=0;
					for(int f=1+g;f<n;f++)
					{
						int m=0;
						for(int s=0;s<n;s++)
						{
							m=m+C[s][f]+H[s][f];
						}
						B[p]=m;
 						if (indexMap.get(B[p]) == null) 
 						{
      						indexMap.put(B[p], new ArrayList<Integer>());
   						}

  						indexMap.get(B[p]).add(f);
  						p++;
  						//System.out.println(B[p-1]);
					}
		//			System.out.println(p);
					Arrays.sort(B);
					for (int index = 0; index < p-1; index++) 
					{
   						int df=indexMap.get(B[index]).remove(0);
   		//				System.out.println(df +" " +B[index]);
						A[g][df]=1;
						A[df][g]=1;
					}
				}
			}
			else
			{
				for(int g=0;g<(n/2)+1;g++)
				{
					HashMap<Integer, ArrayList<Integer>> indexMap = new HashMap<Integer, ArrayList<Integer>>();
					int B[]=new int[n-1-g];
					int p=0;
					for(int f=1+g;f<n;f++)
					{
						int m=0;
						for(int s=0;s<n;s++)
						{
							m=m+C[s][f]+H[s][f];
						}
						B[p]=m;
 						if (indexMap.get(B[p]) == null) 
 						{
      						indexMap.put(B[p], new ArrayList<Integer>());
   						}

  						indexMap.get(B[p]).add(f);
  						p++;
					}
					Arrays.sort(B);
					for (int index = 0; index < p-1; index++) 
					{
   						int df=indexMap.get(B[index]).remove(0);
						A[g][df+1+g]=1;
						A[df+1+g][g]=1;
					}
				}	
			}
			for(int f=0;f<n;f++)
			{
				for(int g=0;g<n;g++)
				{
					System.out.print(A[f][g]);
				}
				System.out.println("");
			}
		}
	}
} 