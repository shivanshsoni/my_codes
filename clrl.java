import java.util.Scanner;
class clrl
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			k=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			int left=1000000001;
			int right=-1;
			int p=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				if(A[j]>k)
				{
					if(left>A[j])
					{
						left=A[j];
					}
					else
					{
						p=1;
					}
				}
				else
				{
					if(right<A[j])
					{
						right=A[j];
					}
					else
					{
						p=1;
					}
				}
			}
			if(p==1)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}
}