import java.util.Scanner;
class iiitd1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			k=scan.nextInt();
			if(k>=0)
			{
				String str=Integer.toString(k);
				j=str.length();
				for(l=0;l<j;l++)
				{
					if(l==0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				System.out.println("");
			}
			else
			{
				k=k*(-1);
				String str=Integer.toString(k);
				j=str.length();
				for(l=0;l<j;l++)
				{
					if(l==0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				System.out.println("");
			}
		}
	}
}