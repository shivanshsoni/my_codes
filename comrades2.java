import java.util.Scanner;
class comrades2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			int a=0;
			int b=0;
			for(k=0;k<n;k++)
			{
				for(l=0;l<n;l++)
				{
					if(A[k]!=A[l]&&A[l]>=0&&A[k]>=0)
					{
						a++;
						A[k]=-1
					}
					else
					{
						b++;
					}
				}
			}
			System.out.println(a+" "+b);
		}
	}
}