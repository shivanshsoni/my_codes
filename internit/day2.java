import java.util.Scanner;
import java.util.Arrays;
class day2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int i,j,k,l;

		int t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			String str=scan.next();
			char B[]=str.toCharArray();
			k=n/4;
			int A[]=new int[26];
			int C[]=new int[26];
			int D[]=new int[26];
			int E[]=new int[26];
			Arrays.fill(A,0);
			Arrays.fill(C,0);
			Arrays.fill(D,0);
			Arrays.fill(E,0);
			for(j=0;j<k;j++)
			{
				int y=(int) B[j];
				A[y-97]++;
			}
			for(j=k;j<2*k;j++)
			{
				int y=(int) B[j];
				C[y-97]++;
			}
			for(j=2*k;j<3*k;j++)
			{
				int y=(int) B[j];
				D[y-97]++;
			}
			for(j=3*k;j<4*k;j++)
			{
				int y=(int) B[j];
				E[y-97]++;
			}
			int p=0;
			for(int e=0;e<26;e++)
			{
				if(A[e]==E[e])
				{

				}
				else
				{
					p=p+Math.abs(A[e]-E[e]);
				}
			}
			for(int s=0;s<26;s++)
			{
				if(C[s]==D[s])
				{

				}
				else
				{
					p=p+Math.abs(C[s]-D[s]);
				}
			}
			if(p==0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO"+" "+p/2);
			}
		}
	}
}