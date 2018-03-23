import java.util.Scanner;
class goodset
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int n;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			if(n==1)
			{
				System.out.println(n);
			}
			if(n==2)
			{
				System.out.print("1 ");
				System.out.print("2 ");
				System.out.println("");
			}
			if(n>2)
			{
				int a=1;
				for(j=0;j<n;j++)
				{
					System.out.print(j+a+" ");
					a++;
				}
				System.out.println("");
			}
		}
	}
}