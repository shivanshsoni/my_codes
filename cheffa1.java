import java.util.Scanner;
import java.util.Arrays;
class cheffa1
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
			int sum=0;
			int p=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				sum=sum+A[j];
			}
			Arrays.sort(A);
			for(l=0;l<n-1;l++)
			{
				if(A[l]!=A[l+1])
				{
					sum++;
					p=1;
				}
			}
			if(p==1)
			{
				sum++;
			}
			System.out.println(sum);
		}
	}
}