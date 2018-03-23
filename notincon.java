import java.util.Scanner;
class notincon
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,m,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			m=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[m];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			k=0;
			for(l=0;l<m;l++)
			{
				B[l]=scan.nextInt();
				for(int y=0;y<n;y++)
				{
					if(A[y]==B[l])
					{
						k++;
					}
				}
			}
			System.out.println(k);
		}
	}
}