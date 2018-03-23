import java.util.*;
import java.io.*;
class subarrayss
{
	public static void main(String[]args) throws NumberFormatException, IOException;
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int t,i,j,k,l;
		t=Integer.parseInt(br.readLine());
		for(i=0;i<t;i++)
		{
			int n=Integer.parseInt(br.readLine());
			int A[]=new int[n];
			StringTokenizer ks=new StringTokenizer(br.readLine(), " ");
			for(j=0;j<n;j++)
			{
				A[j]=Integer.parseInt(ks.nextToken());
			}
			Long sums=0L;
			for(k=0;k<n;k++)
			{
				for(l=k+1;l<n;l++)
				{
					TreeSet ts=new TreeSet();
					int p=0;
					int sum=0;
					for(int y=k;y<=l;y++)
					{
						sum++;
						if(ts.add(A[y]))
						{

						}
						else
						{
							p=1;
						}
					}
					if(p==0)
					{
						sums=sums+sum;
					}
				}
			}
			System.out.println(sums+n);
		}

	}
}