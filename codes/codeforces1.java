import java.util.Scanner;
public class codeforces1
{
	public static void main(String[]args)
	{
			Scanner scan=new Scanner(System.in);
			int t,i,j,k,l;
			t=scan.nextInt();
			String str;
			l=0;
			for(i=0;i<t;i++)
			{
				str=scan.next();
				if(str.equals("Tetrahedron"))
				{
					l=l+4;
				}
				else if(str.equals("Cube"))
				{
					l=l+6;
				}
				else if(str.equals("Octahedron"))
				{
					l=l+8;
				}
				else if(str.equals("Dodecahedron"))
				{
					l=l+12;
				}
				else
				{
					l=l+20;
				}
			}
			System.out.println(l);
	}
}