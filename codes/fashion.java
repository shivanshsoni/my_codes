import java.util.Scanner;
import java.util.Arrays;
class fashion
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			l=0;
			int sum=0;
			for(j=0;j<n;j++)
			{
		//		(j<n)
		//		{
					A[j]=scan.nextInt();
		//		}
			}
				for(int y=0;y<n;y++)
				{
					B[y]=scan.nextInt();
				}
			
			Arrays.sort(A);
			Arrays.sort(B);
			for(int a=0;a<n;a++)
			{
				//for(int b=0;b<n;b++)
				//{
					sum=sum+A[a]*B[a];
				//}
			}
			System.out.println(sum);
		}
	}
}