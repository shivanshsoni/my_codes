import java.util.Scanner;
class stack2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,a,b;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			a=scan.nextInt();
			int A[]=new int[a+2];
			A[0]=scan.nextInt();
			l=1;
			for(j=0;j<a;j++)
			{
				String str=scan.next();
				if(str.equals("P"))
				{
					A[l]=scan.nextInt();
					l++;
				}
				else
				{
					A[l]=A[l-2];
					l++;
				}
			}
			System.out.println("Player"+" "+A[a]);
		}
	}
}