import java.util.Scanner;
class cook85a
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int k=scan.nextInt();
			int j=scan.nextInt();
			int l=scan.nextInt();
			Double d3=2.00;
			Double d1=k*Math.sqrt(2)/j;
			Double d2=k*d3/l;
			//System.out.println(d1+" "+d2);
			if(d2>d1)
			{
				System.out.println("Stairs");
			}
			else
			{
				System.out.println("Elevator");
			}
		}
	}
}