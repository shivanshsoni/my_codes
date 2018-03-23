import java.util.Scanner;
class bladder
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
			if(j%2!=0&&k%2!=0||j%2==0&&k%2==0)
			{
				if(j-k==2||k-j==2)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else if(j%2==0&&k%2!=0)
			{
				if(j-k==1)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else if(j%2!=0&&k%2==0)
			{
				if(k-j==1)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}