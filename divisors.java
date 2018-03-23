import java.util.Scanner;
class divisors
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		Double d=Math.pow(2,t-1);
		Long h=d.longValue();
		Long sum=1L;
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			sum=sum*(h*k+1L)%1000000007;
		}
		System.out.println(sum%1000000007);
	}
}