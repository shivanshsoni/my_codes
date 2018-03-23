import java.util.Scanner;
class prime1
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
			for(j=a;j<=b;j++)
			{
				int p=0;
				for(l=2;l*l<=j;l++)
				{
					if(j%l==0&&j>1)
					{
						p=1;
						break;
					}
				}
				if(p==0&&j>1)
				{
					System.out.println(j);
				}
			}
			System.out.println("");
		}
	}
}