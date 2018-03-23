import java.util.Scanner;
public class prob2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,m,i,j,k,l;
		n=scan.nextInt();
		m=scan.nextInt();
		k=scan.nextInt();
		i=0;
		j=0;
		while(j<=m)
		{	
			j=i+j;
			i++;
		}
		if(k==1&&m%n!=0||k==n&&m%n!=0)
		{
			System.out.println(i-2);
		}
		else if(k==1&&m%n==0 ||k==n&&m%n==0)
		{
			System.out.println(i-2);
		}
		else
		{
			System.out.println(i-3);
		}
	}
}