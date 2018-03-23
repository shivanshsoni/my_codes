import java.util.Scanner;
class reverse
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,a,b,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			int reverse=0;
			while(a!=0)
			{
				reverse=reverse*10;
				reverse=reverse+a%10;
				a=a/10;
			}
			a=reverse;
			reverse=0;
			while(b!=0)
			{
				reverse=reverse*10;
				reverse=reverse+b%10;
				b=b/10;
			}
			b=reverse;
			reverse=0;
			k=a+b;
			while(k!=0)
			{
				reverse=reverse*10;
				reverse=reverse+k%10;
				k=k/10;
			}
			System.out.println(reverse);
		}
	}
}