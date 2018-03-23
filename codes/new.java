import java.util.Scanner;
class newhome
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,k,i,j,l;
		n=scan.nextInt();
		k=scan.nextInt();
		l=240-k;
		j=0;
		int m=0;
		for(i=1;i<n;i++)
		{
			j=5*i+j;
			if(j>=l)
			{
				m=i;
				break;
			}
		}
		System.out.println(m);
	}
}