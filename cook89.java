import java.util.Scanner;
import java.util.Arrays;
class cook89b
{
	public static void main(Strig[]args)
	{
		Scanner scan=new Scanner(System.in)
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			for(j=0;j<t;j++)
			{
				A[j]=scan.nextInt();
				B[j]=A[j];
			}
			Arrays.sort(B);
			if(B[n-1]>=m)
			{
				System.out.println("1");
			}
			else
			{		
				int g=1;	
				int p=0;
				for(k=0;k<n;k++)
				{
					int sum=sum+A[k];
					int sum1=0;
					for(l=1;l<n;l++)
					{
						sum1=sum1+A[l];
						if(sum1>=m)
						{
							g++;
						}
					}
					if(p<g)
					{
						p=g;
						if(p==2)
						{
							System.out.println("2");
							break;
						}
					}	
				}
				System.out.println(p);
			}
		}
	}
}