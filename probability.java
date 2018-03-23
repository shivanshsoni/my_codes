import java.util.Scanner;
import java.util.Arrays;
class probability
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,l;
		
		int n=scan.nextInt();
		Long k=scan.nextLong();
		int A[]=new int[n];
		for(j=0;j<n;j++)
		{
			A[j]=scan.nextInt();
		}
		Arrays.sort(A);
		Long p=0L;
		int m=0;
		for(l=0;l<n;l++)
		{
			for(int y=0;y<n;y++)
			{
				Long sum=0L;
				for(int h=l;h<=y;h++)
				{
					sum=sum+A[h];
					if(sum>k)
					{
						break;
					}
				}
				if(sum>k)
				{
					break;
				}
				if(sum<=k&&sum>0L)
				{
					m++;
				}
			}
		}
			//System.out.println(m+" "+p);
		p=n*(n+1L)/2L;
		Double d=(double) m;
		Double f=(double) p;
		System.out.println(d/f);
	}
}

