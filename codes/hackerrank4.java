import java.util.Scanner;
class hackerrank4
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		k=scan.nextInt();
		l=t;
		i=0;
		while(t!=0)
		{
			System.out.println(t);
			t=t-i;
			if(t+k>t)
			{
				t=l;
			}
			else
			{
				t=t+k;
			}
			i++;
		}
	}
}