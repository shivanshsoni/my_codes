import java.util.Scanner;
class circle
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,a=0,b=0;
		t=scan.nextInt();
		for(i=1;i<=t/2;i++)
		{
			j=scan.nextInt();
			k=scan.nextInt();
			a=a+j;
			System.out.printf("%d %d\n",a,b);
			a=a+j;
		}
		a=0;
		for(i=t/2+1;i<=t;i++)
		{
		    j=scan.nextInt();
			k=scan.nextInt();
			a=a-j;
			System.out.printf("%d %d\n",a,b);
			a=a-j;
		}
	}
}