import java.util.Scanner;
class jump
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a,b,n,i,j,k,l;
		a=scan.nextInt();
		b=scan.nextInt();
		n=scan.nextInt();
		l=0;
		j=0;
		for(i=0;i<n;i++)
		{
			l=0;
			k=scan.nextInt();
			j=a;
			while(true)
			{
				if(k<=j)
				{
					l++;
					break;
				}
				else
				{
					l++;
					j=j+a-b;
				}
			}
			System.out.println(l);
		}
	}
}