import java.util.*;
class checks
{
	public static void main(String[]atrgs)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String ptr[]=str.split(" ");
		System.out.println(ptr.length);
		for(int i=0;i<ptr.length;i++)
		{
			System.out.println(ptr[i].charAt(0));
		}
	}
}