import java.util.Scanner;
class kjcs2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
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
			sum=sum+A[i];
		}
		System.out.println(sum);
	}
}