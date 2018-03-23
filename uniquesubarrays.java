import java.util.Scanner;
import java.util.*;
class uniquesubarrays
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			Long sums=0L;
			for(k=0;k<(1<<n);k++)
			{
				//TreeSet ts=new TreeSet();
				int p=0;
				int sum=0;
				for(l=0;l<n;l++)
				{
					if((k&(1<<l))>0)
					{
						
						System.out.print(A[l]+" ");
						//if(ts.add(A[k]))
						//{

						//}
						//else
						//{
					//		p=1;
					//	}
					}
					System.out.println(" ");
					//if(p==0)
					//{
					//	sums=sums+sum;
					//}
				}
			}
			//System.out.println(sums);
		}
	}
}