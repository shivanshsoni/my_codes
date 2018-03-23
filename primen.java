import java.util.Scanner;
class primen
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l,x;
		t=scan.nextInt();
		for(j=0;j<t;j++)
		{
			int pr=0;
			n=scan.nextInt();
			n=n+2;
			l=0;
			k=2;
			int m=0;
			while(l!=n)
			{
				int p=0;
				for(i=2;i*i<=k;i++)
				{
					if(k%i==0)
					{
						p=1;
						break;
					}
				}
				if(p==0)
				{
					l++;
					m=k;
				}
				k++;
			}
			System.out.println(m*6);
		}
	}
}