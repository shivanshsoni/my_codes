import java.util.Scanner;
import java.util.Arrays;
class idlis
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l,f;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			k=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				k=k+A[j];
			}
			f=0;
			Arrays.sort(A);
			if(A[n-1]-A[0]==k/n)
			{
				for(l=0;l<n;l++)
				{
					if(A[l]==k/n)
					{
						f++;
					}
				}
				System.out.println(f);
				System.out.println((n-f)/2);
			}
			else
			{
				System.out.println("-1");
			}

		}
	}
}