import java.util.Scanner;
class courseinauniversity
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			int m=0;
			for(k=1;k<n;k++)
			{
				int p=0;
				for(l=0;l<n;l++)
				{
					if(A[l]==k)
					{
						p=1;
						break;
					}
				}
				if(p==0)
				{
					m++;
				}
			}
			System.out.println(m+1);
		}
	}
}