import java.util.Scanner;
class graph1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		int sum=0;
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
			sum=sum+A[i];
		}
		if(sum=2*(t-1))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}