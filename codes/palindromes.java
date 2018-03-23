import java.util.Scanner;
class palindromes
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,sum;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			j=scan.nextInt();
			for(k=j+1;;k++)
			{
				sum=0;
				int p=k;
				while(k>0)
				{
					l=k%10;
					sum=(sum*10)+l;
					k=k/10;
				}
				if(sum==p)
				{
					System.out.println(p);
					break;
				}
			}
		}
	}
}