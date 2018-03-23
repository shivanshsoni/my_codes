import java.util.Scanner;
//import org.apache.commons.lang3.StringUtils;
class codes
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		String ptr[]=new String[t];
		int p=0;
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			if(str.equals("add"))
			{
				String mtr=scan.next();
				ptr[p]=mtr;
				p++;
			}
			else
			{
				int m=0;
				String mtr=scan.next();
				for(j=0;j<p;j++)
				{
    				int count = 0;
    				for (l = 0; l < ptr[j].length(); l++) 
    				{
      		  			if (ptr[j].charAt(l) == mtr.charAt(count)) 
      		  			{
        				    count++;
       			 		} 
       			 		else 
       			 		{
            				count = 0;
       					}
      					if (count == mtr.length()) 
      					{
 				          	m++;
 				          	count=0;
       					}
       				}
				}
				System.out.println(m);
			}
		}
	}
}