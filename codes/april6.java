import java.util.Scanner;
class april6
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,n,q,a,b,c;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			q=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			for(k=0;k<q;k++)
			{
				int p=0;
				int d=0;
				int s=0;
				a=scan.nextInt();
				b=scan.nextInt();
				c=scan.nextInt();
				for(l=a-1;l<=b-2;l++)
				{
					if(A[l+1]-A[l]==0)
					{
						p++;
						if(p+1==c)
						{
							d++;
						}
					}
					else
					{
						s++;
						p=0;
					}
				}
				if(c==1)
				{
					System.out.println(s+1);
				}
				else
				{
					System.out.println(d);
				}
			}
		}
	}
}