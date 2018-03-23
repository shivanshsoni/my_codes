import java.util.Scanner;
class code857
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		//t -> representing no. of test cases
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			//divident represents divident.
			int divident=scan.nextInt();
			//divisor representing divisor
			int divisor=scan.nextInt();
			//initialize quotient to zero
			int quotient=0;
			while(divident>=divisor)
			{
				divident -=divisor;
				quotient++;
			}
			//quotient is the final answer
			System.out.println(quotient);
		}
	}
}