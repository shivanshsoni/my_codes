import java.util.Scanner;
class replace
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,ij,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<n;j++)
		{
			k=scan.nextInt();
			if(k==1)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				int c=scan.nextInt();
				int d=scan.nextInt();
				for(l=a-1;l<b;l++)
				{
					if(A[l]==c)
					{
						A[l]=d;
					}
				}
			}
			else
			{
				int m=0;
				int a=scan.nextInt();
				int b=scan.nextInt();
				int c=scan.nextInt();
				for(l=a-1;l<b;l++)
				{
					if(A[l]==c)
					{
						m++;
					}
				}
				System.out.println(m);
			}
		}
	}
}