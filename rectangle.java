import java.util.Scanner;
class rectangle
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,sum;
		sum=0;
		n=scan.nextInt();
		for(i=1;i<=Math.sqrt(n);i++)
		{
			sum=sum+n/i-i+1;
		}
		System.out.println(sum);
	}
}