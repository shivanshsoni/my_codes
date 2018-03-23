import java.util.Scanner;
public class prob835c
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int n=scan.nextInt();
		int q=scan.nextInt();
		int c=scan.nextInt();
		int A[]=new int[n];
		int B[]=new int[n];
		int C[]=new int[n];
		for(int y=0;y<n;y++)
		{
			A[y]=scan.nextInt();
			B[y]=scan.nextInt();
			C[y]=scan.nextInt();
		}
		for(i=0;i<q;i++)
		{
			t=scan.nextInt();
			int x1=scan.nextInt();
			int y1=scan.nextInt();
			int x2=scan.nextInt();
			int y2=scan.nextInt();
			int m=0;
			l=0;
			for(j=0;j<n;j++)
			{
				if(A[j]>=x1&&A[j]<=x2&&B[j]>=y1&&B[j]<=y2)
				{
					l=C[j]+t;
					m=m+l%(c+1);	
				}
			}
			System.out.println(m);
		}
	}
}