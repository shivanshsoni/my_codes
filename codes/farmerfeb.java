import java.util.Scanner;
class farmerfeb
{
	public static void main(String[]atsg)
	{
		Scanner scan=new Scanner(System.in);
		int t,x,y,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			x=scan.nextInt();
			y=scan.nextInt();
			j=x+y;
			for(k=j+1;k<=2003;k++)
			{
				int flag=0;
				for(int m=2;m<=k/2;m++)
				{
					if(k%m==0)
					{
						flag=1;
					}
				}
				if(flag==0)
				{
					System.out.println(k-j);
					break;
				}
			}
		}
	}
}