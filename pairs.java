import java.util.Scanner;
class pairs
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,p,q,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			p=scan.nextInt();
			q=scan.nextInt();
			k=0;
			if(p>q)
			{
				l=2;
				while(l!=0||l!=1)
				{
					l=p/q;
					k++;
				}
			}
			else
			{
				l=0;
				while(l!=0||l!=1)
				{
					l=q/p;
					k++;
				}
			}
			int A[]=new int[1000000];
			int B[]=new int[1000000];
			int m=0;
			int y=0;
			for(int a=1;a<Math.pow(2,k);a++)
			{
				for(j=2;j<=p;j++)
				{
					A[m]=a^j;
					m++;
				}
				for(int s=2;s<q;s++)
				{
					B[y]=a^s;
					y++;
				}
			}
			l=0;
			for(int a=0;a<m;a++)
			{
				for(int b=0;b<y;b++)
				{
					if(A[a]-B[b]==1)
					{
						l++;
					}
				}
			}
			System.out.println(l%24);
		}
	}
}