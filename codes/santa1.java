import java.util.Scanner;
class santa1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,m,k,i,j,l;
		int a,b,c;
		a=0;b=0;
		n=scan.nextInt();
		m=scan.nextInt();
		k=scan.nextInt();
		a=(k/(2*m))+1;
		b=(k/(2*n))+1;
		if(k%2==0)
		{
			System.out.printf("%d %d R",a,b);
		}
		else
		{
			System.out.printf("%d %d L",a,b);
		}
	}
}