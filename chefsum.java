import java.util.Scanner;
class chefsum
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(l=0;l<t;l++)
		{
			int n=scan.nextInt();
			Long A[]=new Long[n];
			Long sum=0L;
			for(int a=0;a<n;a++)
			{
				A[a]=scan.nextLong();
				sum=sum+A[a];
			}
			int p=1;
			sum=sum+A[0];
			Long sum1=A[0];
			Long sum2=sum-A[0];
			for(i=1;i<n;i++)
			{
				sum1=A[i]+sum1;
				sum2=sum2-A[i-1];
				//System.out.println(sum1+" "+sum2+"  "+sum);
				if(sum1+sum2<sum)
				{
					sum=sum1+sum2;
					p=i+1;
				}
			}
			System.out.println(p);
		}
	}
}