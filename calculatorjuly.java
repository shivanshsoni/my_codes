import java.util.Scanner;
class calculatorjuly


{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k;
		t=scan.nextInt();
		long y,ans,l;
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int b=scan.nextInt();
			y=n/2;
			y=y-(y%b);
			ans=0L;
			while(y<=n/2)
			{
				l=(n-y)*(y/b);
				if(ans<l)
				{
					ans=l;
				}
				y=y+b;
			}
			if(ans<(n-y)*(y/b))
			{
				ans=(n-y)*(y/b);
			}
			System.out.println(ans);
		}
	}
}