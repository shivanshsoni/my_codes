import java.util.Scanner;
class chefapar
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
			k=0;
			int o=0;
			int y=0;
			l=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				if(A[j]==0)
				{
					o++;
					k++;
				}
				else
				{
					y=j;
					l++;
				}
			}
			if(n==l)
			{
				System.out.println("0");
			}
			else if(n==o)
			{
				System.out.println(o*100+1000*o);
			}
			else
			{
				if(l<=y+1-l)
				{
					k=k+l;
				}
				else
				{
					k=k+o;
				}
				System.out.println(k*100+o*1000);
			}
		}
	}
}