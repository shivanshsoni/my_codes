import java.util.Scanner;
class nhay
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l,a,b;
		while(true)
		{
			n=scan.nextInt();
			String str,ptr;
			str=scan.next();
			ptr=scan.next();
			int pos = ptr.indexOf(str);
			if(pos>0)
			{
				System.out.println(pos);
			}
			else
			{
				System.out.println("");
			}
		}
	}
}