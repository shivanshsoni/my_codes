import java.util.Scanner;
class binary
{
	public static void main(String[]atgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		String str=Integer.toBinaryString(t);
		System.out.println(str);
	}
}