import java.util.Scanner;
import java.util.Arrays;
class bubblesort
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int number=scan.nextInt();
			int A[]=new int[number];
			for(j=0;j<number;j++)
			{
				A[j]=scan.nextInt();
			}
			Arrays.sort(A);
			for(l=0;l<number;l++)
			{
				System.out.print(A[l]+" ");
			}
			System.out.println("");
		}
	}
}