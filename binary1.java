import java.util.Scanner;
class binary1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			String str=Integer.toBinaryString(k);
			System.out.println(str);
		}
	}
}