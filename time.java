import java.util.Scanner;
class time
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str=scan.next();
		char A[]=str.toCharArray();
		StringBuilder  ptr=new StringBuilder("");
		for(i=0;i<str.length();i++)
		{
			if(i!=2)
			{
				String mtr=Character.toString(A[i]);
				ptr=ptr.append(mtr);
			}
		}
		String jtr=ptr.toString();
		k=Integer.parseInt(jtr);
		j=k;
		int y=k;
		l=0;
		while(l!=k)
		{
			j=k;
			for(i=0;i<3;i++)
			{
				k=l*10+k%10;
				k=k/10;
			}
			j++;
		}
		System.out.println(j-y);
	}
}