import java.util.Scanner;
import java.util.Arrays;
class stack4
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		Arrays.sort(A);
		l=0;
		for(j=0;j<t-1;j++)
		{
			if(A[j]-A[j+1]<0)
			{
				l++;
			}
		}
		System.out.println(l);
	}
}