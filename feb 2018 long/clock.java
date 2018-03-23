import java.util.Scanner;
class lucas
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		Long A[]=new Long[100000];
		A[0]=1L;
		for(i=1;i<100000;i++)
		{
			A[i]=A[i-1]*(i+1)%;
		}
		
	}
}