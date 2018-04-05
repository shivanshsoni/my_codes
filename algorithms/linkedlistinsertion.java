import java.util.Scanner;
class linkedlistinsertion
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			StringBuilder str=new StringBuilder("");
			for(j=0;j<n;j++)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				if(b==0)
				{
					str=str.reverse();
					String htr=Integer.toString(a);
					str.append(htr);
					str.append(" ");
					str.reverse();
				}
				if(b==1)
				{

					String ftr=Integer.toString(a);
					str.append(ftr);
					str.append(" ");
					//System.out.println(str.toString());
				}
			}
			String stri = str.toString();
			for(k=0;k<stri.length();k++)
			{
				System.out.print(stri.charAt(k)+" ");
			}
			System.out.println(" ");
		}
	}
}