import java.util.Scanner;
import java.util.*;
class code
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		HashSet hs=new  HashSet();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			hs.add(k);
		}
		String str[]=new String[hs.size()];
		hs.toArray(str);
		for(String ptr:str)
		{
				System.out.println(ptr);
		}
	}
}