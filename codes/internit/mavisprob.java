import java.util.Scanner;
import java.util.Arrays;
class mavisprob
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int i,j,k,l;
		int A[]=new int[100007]
		Arrays.fill(A,0);
		int B[]=new int[t];
		int C[]=new int[t];
		for(i=0;i<t;i++)
		{
			B[i]=scan.nextInt();
			C[i]=B[i];
		}	
		Arrays.sort(B);
		for(l=0;l<t;l++)
		{
			A[B[l]]=l;
		}
		for(j=0;j<t;j++)
		{
			System.out.print(A[C[j]]);
		}
	}
}