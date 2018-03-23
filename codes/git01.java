import java.util.Scanner;
class git01
{
	public static void main(String[]args)
	{
		int m=0;
		for(int i=1;i<=524800;i++)
		{
			if(524800%i==0)
			{
				m++;
			}
		}
		System.out.println(m);
	}
}
