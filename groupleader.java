import java.util.Scanner;
class groupleader
{
	public static void main(String[]arsg)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,n,a,b,c;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			k=scan.nextInt();
			for(int y=0;y<k;y++)
			{
				a=scan.nextInt();
				b=scan.nextInt();
				c=scan.nextInt();
				int h=-1;
				for(l=a;l<=b;l++)
				{
					int g=0;
					for(int d=a;d<=b;d++)
					{
						if(A[l]==A[d])
						{
							g++;
						}
					}
					System.out.println(g);
					if(g==c)
					{
						if(h==-1||h>A[l])
						h=A[l];
					}
				}
				System.out.println(h);
			}
		}
	}
}