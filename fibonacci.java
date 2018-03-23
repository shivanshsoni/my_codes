import java.util.Scanner;
class fibonacci
{
	public static void main(String[]ars)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[n];
		A[0]=0;
		A[1]=1;
		for(i=2;i<t;i++)
		{
			A[i]=A[i-1]+A[i-2];
		}
		System.out.println(A[t-1]);
	}
}