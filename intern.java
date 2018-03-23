//code for intern round
//we have to check wheather string ptr is a substring of string str or not.
import java.util.Scanner;
class intern
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		String str,ptr;
		str=scan.next();
		ptr=scan.next();
		int number=0,i,j=0,k,l;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ptr.charAt(number))
			{
				number++;
			}
			else
			{
				number=0;
			}
			if(number==ptr.length())
			{
				System.out.println("String "+ptr+" is substring of String "+ str);
				j=1;
				break;
			}
		}
		if(j!=1)
		{
			System.out.println("String "+ptr+" is not a substring of String "+ str);
		}

	}
}