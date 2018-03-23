import java.util.Scanner;
class prime
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			j=scan.nextInt();
			k=scan.nextInt();
			for(l=j;l<=k;l++)
			{
				int p=0;
				for(int y=2;y<l/2;y++)
				{
					if(l%y==0)
					{
						p=1;
						break;
					}
				}
				if(p==0&&l>1)
				{
					System.out.println(l);
				} 
			}
			System.out.println("");
		}
	}
}