import java.util.Scanner;
class problem
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int i,j;
		double k;
		
		for(i=1;i<=10000;i++)
		{
			k=0;
			for(j=1;j<=i;j++)
			{
				k=k+j;
			}
			double p=Math.sqrt(k);
			if(p==(int)p)
			System.out.printf("%d %.5f\n",i,p);
		}
	}
}