import java.util.Scanner;
class kjcs2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int n=scan.nextInt();
		for(l=0;l<n;l++)
		{
		t=scan.nextInt();
		int A[]=new int[t];
		Long sum=0L;
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
			if(i>0&&i%2!=0)
			{
				A[i]=A[i]+A[0];
			}
			if(i>0&&i%2==0)
			{
				A[i]=Math.abs(A[i]-A[0]);
			}
		}
		for(k=1;k<t;k++)
		{
			sum=sum+Math.abs(A[k]-A[k-1]);
		}
		System.out.println(sum);
	}
}
}