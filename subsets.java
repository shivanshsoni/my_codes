import java.util.Scanner;
class subsets
{
	public static void main(String[]srgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,n,sum,max,min;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			k=scan.nextInt();
			int A[]=new int[n];
			for(int y=0;y<n;y++)
			{
				A[y]=scan.nextInt();
			}
			min=0;
			max=0;
			for(j=0;j<(1<<n);j++)
			{
				sum=0;
				for(l=0;l<n;l++)
				{
					if((j & (1<<l))>0)
					{
						sum=sum+A[l];
					}
				}
				sum=sum%k;
				if(j==0)
				{
					max=sum;
				}
				if(sum!=0)
				{
					
					if(sum>max)
					{
						max=sum;
					}		
				}
			}
			for(j=0;j<(1<<n);j++)
			{
				sum=0;
				for(l=0;l<n;l++)
				{
					if((j & (1<<l))>0)
					{
						sum=sum+A[l];
					}
				}
				sum=sum%k;
				if(sum==max)
				{
					min++;
				}
			}
			System.out.println(max + " "+ min);
		}
	}
}