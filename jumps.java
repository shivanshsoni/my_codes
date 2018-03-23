import java.util.Scanner;
class jumps
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		l=0;
		int p=0;
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
			if(i+1+A[i]>t&&p==0)
			{
				l=i+1;
				p=1;
			}
		}
		System.out.println(l);
	}
}