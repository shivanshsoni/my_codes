import java.util.Scanner;
class subset
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,a,b,c,d,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			d=scan.nextInt();
			if(a+b+c+d==0||a+b+c==0||b+c+d==0||a+b+d==0||a+c+d==0||a+b==0||a+c==0||a+d==0||b+c==0||b+d==0||c+d==0||a==0||b==0||c==0||d==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}