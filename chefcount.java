import java.util.Scanner;
class chefcount
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int p=1000000000;
			for(j=0;j<n;j++)
			{
				System.out.print(p+" ");
				p--;
				if(p==99991)
				{
					p=100000;
				}
			}
			System.out.println("");
		}
		
	}
}