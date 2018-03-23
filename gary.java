import java.util.Scanner;
class gary
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();	
		}
		int sum=0;
		for(j=0;j<n;j++)
		{
			k=scan.nextInt();
			if(k==1)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				A[b-1]=A[a-1];
			}
			if(k==2)
			{
				int a=scan.nextInt();
				for(l=0;l<t;l++)
				{
					sum=sum+(int) Math.ceil(A[l]/a);
				}
				System.out.println(sum);
			}
		}
	}
}