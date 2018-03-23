import java.util.Scanner;
import java.util.TreeSet;
import java.io.*;
class monkfriends1
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int t,i,j,k;
		Long l;
		t=Integer.parseInt(scan.readLine());
		for(i=0;i<t;i++)
		{
			int n=Integer.parseInt(scan.readLine());
			int m=Integer.parseInt(scan.readLine());
			TreeSet<Long> tree=new TreeSet<Long>();
			for(j=0;j<n;j++)
			{
				l=Long.parseLong(scan.readLine());
				tree.add(l);
			}
			for(k=n;k<n+m;k++)
			{	
				l=Long.parseLong(scan.readLine());
				Boolean res=tree.add(l);
				if(res)
				{
					System.out.println("NO");
				}
				else
				{
					System.out.println("YES");
				}
			}
		}
	}
}