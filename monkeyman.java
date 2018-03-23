import java.util.Scanner;
class monkeyman
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,n;
		i=scan.nextInt();
		j=scan.nextInt();
		n=scan.nextInt();
		
		l=0;
		int y=0;
		for(k=0;k<n;k++)
		{
			int p=scan.nextInt();
			y=0;
			while(y<=p)
			{
				y=i+y;
				if(p<=y)
				{
					l++;
					break;
				}
				else
				{
					y=y-j;
					l++;
				}
			}
		}
		System.out.println(l);
	}
}