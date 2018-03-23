import java.util.Scanner;
class minperm
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
			int a=0;
			if(n%2==0)
			{
				for(j=0;j<n;j=j+2)
				{
					A[j]=a+2;
					a=a+2;
				}
				a=-1;
				for(j=1;j<n;j=j+2)
				{
					A[j]=a+2;
					a=a+2;
				}
			}
			else
			{
				for(j=0;j<n-1;j=j+2)
				{
					A[j]=a+2;
					a=a+2;
				}
				a=-1;
				for(j=1;j<n-2;j=j+2)
				{
					A[j]=a+2;
					a=a+2;
				}
				A[n-1]=a+2;
				a=a+2;
				A[n-2]=a+2;
			}
			for(int b=0;b<n;b++)
			{
				System.out.print(A[b]+" ");
			}
			System.out.println("");
		}	
	}
}