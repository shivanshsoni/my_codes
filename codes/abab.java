import java.util.Scanner;
class abab
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int m=0;
			double sqrt=Math.sqrt(a);
			l=(int) sqrt;
			if(l==1)
			{
				l++;
			}
			else if(Math.pow(l,2)!=Math.pow(sqrt,2))
			{
				l++;
			}
			if(a<=2)
			{
				m=1;
			}
			while(l*l<=b)
			{
				l++;
				m++;
			}
			System.out.println(m);
		}
	}
}