import java.util.Scanner;
class nsteps
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			j=scan.nextInt();
			k=scan.nextInt();
			if(j==k || j-k==2&&j!=0&&j!=1)
			{
				if(j%2==0)
				{
					System.out.println(j+k);
				}
				else
				{
					System.out.println(j+k-1);
				}
			}
			else
			{
				System.out.println("No Number");
			}
		}
	}
}