import java.util.Scanner;
import java.util.Arrays;
class twocoins
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[2*(n-1)];
			for(j=0;j<2*n-2;j++)
			{
				A[j]=scan.nextInt();	
			}
			Arrays.sort(A);
			int p=0;
			int s=0;
			for(k=1;k<=n;k++)
			{
				int m=0;
				for(l=p;l<2*n-2;l++)
				{
					if(A[l]==k)
					{
						m++;
						p++;
					}
					else
					{
						break;
					}
				}
				if(m>=3)
				{
					s++;
				}
			}
			System.out.println(n-s);
		}
	}
}
