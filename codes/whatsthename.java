import java.util.*;
class whatsthename
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<=t;i++)
		{
			String str=scan.nextLine();
			String ptr[]=str.split("\\s");
			int u=ptr.length;
			if(i==0)
			{
				u=0;
			}
			if(u==1)
			{
				k=ptr[0].length();
				char A[]=ptr[0].toCharArray();
				for(j=0;j<k;j++)
				{
					int p=(int) A[j];
					if(j==0)
					{
						if(p>=97)
						{
							p=p-32;
						}
					}
					else
					{
						if(p<97)
						{
							p=p+32;
						}
					}
					A[j]=(char) p;
				}
				for(int m=0;m<k;m++)
				{
					System.out.print(A[m]);
				}
				System.out.println("");
			}
			if(u==2)
			{
				char ch=ptr[0].charAt(0);
				int y=(int) ch;
				if(y>=97)
				{
					y=y-32;
				}
				ch=(char) y;
				k=ptr[1].length();
				char A[]=ptr[1].toCharArray();
				for(j=0;j<k;j++)
				{
					int p=(int) A[j];
					if(j==0)
					{
						if(p>=97)
						{
							p=p-32;
						}
					}
					else
					{
						if(p<97)
						{
							p=p+32;
						}
					}
					A[j]=(char) p;
				}
				System.out.print(ch+"."+" ");
				for(int m=0;m<k;m++)
				{
					System.out.print(A[m]);
				}
				System.out.println("");
			}
			if(u==3)
			{
				char ch=ptr[0].charAt(0);
				int y=(int) ch;
				if(y>=97)
				{
					y=y-32;
				}
				ch=(char) y;
				char ch2=ptr[1].charAt(0);
				l=(int) ch2;
				if(l>=97)
				{
					l=l-32;
				}
				ch2=(char) l;
				k=ptr[2].length();
				char A[]=ptr[2].toCharArray();
				for(j=0;j<k;j++)
				{
					int p=(int) A[j];
					if(j==0)
					{
						if(p>=97)
						{
							p=p-32;
						}
					}
					else
					{
						if(p<97)
						{
							p=p+32;
						}
					}
					A[j]=(char) p;
				}
				System.out.print(ch+"."+" "+ch2+"."+" ");
				for(int m=0;m<k;m++)
				{
					System.out.print(A[m]);
				}
				System.out.println("");
			}
		}
	}
}