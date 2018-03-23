import java.util.Scanner;
class decodestring
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			char A[]=str.toCharArray();
			int p=0;
			int sd=0;
			int max=0;
			int m=0;
			StringBuilder ptr=new StringBuilder("");
			for(j=0;j<str.length();j++)
			{
				if(Character.isDigit(A[j]))
				{
					ptr.append(Character.toString(A[j]));
				}
				else
				{
					String mtr=ptr.toString();
					if(mtr.equals(""))
					{

					}
					else
					{
						sd=Integer.parseInt(mtr);
						int g=0;
						if(sd==1||sd==0)
						{
							g=1;
						}
						for(int l=2;l*l<=sd;l++)
						{
							if(sd%l==0)
							{
								g=1;
								break;
							}
						}
						if(g==0)
						{
							m++;
							if(sd>max)
							{
								max=sd;
							}
						}
						ptr=new StringBuilder("");
					}
				}
			}
			if(ptr.toString().equals(""))
			{
				
			}
			else
			{
				sd=Integer.parseInt(ptr.toString());
				int g=0;
						if(sd==1||sd==0)
						{
							g=1;
						}
						for(int l=2;l*l<=sd;l++)
						{
							if(sd%l==0)
							{
								g=1;
								break;
							}
						}
						if(g==0)
						{
							m++;
							if(sd>max)
							{
								max=sd;
							}
						}
			}
			if(m!=0)
			{
			    System.out.println(m+" "+max);
			}
			else
			{
			    System.out.println("0 -1");
			}
		}
	}
}