import java.util.Scanner;
class arraymod
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int p=0;
			int n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			for(k=0;k<n;k++)
			{
				for(l=0;l<n;l++)
				{
					if(A[k]%A[l]>p)
					{
						p=A[k]%A[l];
					}
				}
			}
			System.out.println(p);
		}
	}
}