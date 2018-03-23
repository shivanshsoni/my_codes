import java.util.Scanner;
class stack3
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
				int m=0;
				int p=0;
				int s;
				for(s=j;s>0;s--)
				{
					m=p;
					if(A[j]-A[s-1]>=0)
					{
						p++;
					}
					if(p==m)
					{
						break;
					}
				}
				System.out.print(p+1+" ");
			}
			System.out.println("");
		}
	}
}