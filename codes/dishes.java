import java.util.Scanner;
class dishes

{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,k,i;
		n=scan.nextInt();
		k=scan.nextInt();
		if(k==n)
		{
		for(i=0;i<k;i++)
		{
			System.out.printf("a");
		}
	}
	else
	{
		System.out.println("NO");
	}
	}
}