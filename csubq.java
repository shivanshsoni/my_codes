import java.util.Scanner;
import java.util.Arrays;
class csubq
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int q=scan.nextInt();
		l=scan.nextInt();
		int r=scan.nextInt();
		int A[]=new int[t];
		Arrays.fill(A,0);
		for(i=0;i<q;i++)
		{
			k=scan.nextInt();
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(k==1)
			{
				A[a-1]=b;
			}
			else
			{
				int m=0;
				for(int c=a-1;c<b;c++)
				{
					int max=0;
					int p=0;
					if(A[c]<=r)
					{
						for(int d=c;d<b;d++)
						{
							if(max<A[d])
							{
								max=A[d];
							}
							if(A[d]>r)
							{
								p=1;
								break;
							}
							if(max<=r&&max>=l&&p==0)
							{
								m++;
							}
						}
					}
				}
				System.out.println(m);
			}
		}
	}
} 