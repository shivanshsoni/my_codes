import java.util.*;
import java.io.*;
class professor
{
	public static void main(String[]args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t,i,j,k,l;
		t=Integer.parseInt(br.readLine());
		int A[]=new int[t];
		StringTokenizer ks = new StringTokenizer(br.readLine(), " ");
		for(i=0;i<t;i++)
		{
			A[i]=Integer.parseInt(ks.nextToken());
		}
		int n=Integer.parseInt(br.readLine());
		for(j=0;j<n;j++)
		{
			ks=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(ks.nextToken());
			int b=Integer.parseInt(ks.nextToken());
				for(k=a-1;k<b;k++)
				{
					int g=0;
					g=A[k];
					A[k]=A[t-k-1];
					A[t-k-1]=g;
				}
		
		}
		for(l=0;l<t;l++)
		{
			System.out.print(A[l]+" ");
		}
	}
}