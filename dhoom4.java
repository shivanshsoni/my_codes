import java.util.Scanner;
class dhoom4
{
	public static void main(String[]ats)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		k=t;
		i=scan.nextInt();
		int A[]=new int[i];
		for(int u=0;u<i;u++)
		{
			A[u]=scan.nextInt();
		}
		int s=0;
		int m=0;
		for(j=0;j<i;j++)
		{
			for(l=0;l<i-j;l++)
			{
				int p=k;
				for(int a=j;a<l;a++)
				{
					p=p*A[a];
					m=l-j;
				}
				if(p==n)
				{
					s=1;
					break;
				}
			}
			if(s==1)
			{
				break;
			}
		}
		System.out.println(m);
	}
}