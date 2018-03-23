import java.util.Scanner;
//import java.util.Arrays;
class carpal
{
	public static void main(String[]atgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			Long h=0L;
			Long f=0L;	
			for(j=0;j<n;j++)
			{
				f=scan.nextLong();
				if(f>h)
				{
					h=f;
				}
			}
			Long a=scan.nextLong();
			int b=scan.nextInt();
			int c=scan.nextInt();
		//	Arrays.sort(A);
			Long p=(a-1)*h;
			System.out.println(p+".00000000");
		}
	}
} 