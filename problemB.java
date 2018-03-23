import java.util.Scanner;
class problemB
{
	public static void main(String[]atgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str,ptr,mtr;
		str=scan.next();
		ptr=scan.next();
		j=str.length();
		char A[]=str.toCharArray();
		char B[]=ptr.toCharArray();
		mtr="";
		k=0;
		for(i=0;i<j;i++)
		{
			if(A[i]<=B[i])
			{
				char ph=A[i];
				char ch=ph++;
				String chr=Character.toString(ch);
				mtr=mtr.concat(chr);
			}
			else
			{
				k=1;
			}
		}
		if(k==1)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(mtr);
		}
	}
}