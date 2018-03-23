import java.util.Scanner;
class xentask
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,a,b;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int sum=0;
			a=scan.nextInt();
			b=scan.nextInt();
			int c=a+b+1;
			sum=c*(c+1)/2;
			System.out.println(sum-b);
		}
	}
}