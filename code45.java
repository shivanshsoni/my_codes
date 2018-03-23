import java.util.Scanner;
class code45
{
	public static void main(String[]ats)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			k=scan.nextInt();
			for(j=0;j<n-1;j++)
			{
				System.out.print("0 ");
			}
			System.out.print((k*Math.sqrt(n)*n)/(n-1));
			System.out.println("");
		}
	}

}