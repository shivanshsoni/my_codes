import java.util.Scanner;
class palindrome12
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,sum;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			j=scan.nextInt();
			while(true)
			{
				sum=0;
				k=j+1;
				int p=k;
				while(k!=0)
				{
					l=k%10;
					sum=sum*10+l;
					k=k/10;
				}
				if(sum==p)
				{
					System.out.println(sum);
					break;
				}
				else
				{
					k++;
				}
			}
		}
	}
}