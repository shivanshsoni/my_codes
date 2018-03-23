import java.util.Scanner;
class samero8f
{
	public static void main(String[]atsf)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=1;
		while(n!=0)
		{
			k=0;
			n=scan.nextInt();
			if(n==0)
			{
				break;
			}
			
			for(i=1;i<=n;i++)
			{
				k=k+i*i;
			}
			System.out.println(k);
		}
	}
}