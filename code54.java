import java.util.Scanner;
import java.util.*;
class code54
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int max=0;
		LinkedHashMap<Integer,Integer> h=new LinkedHashMap<Integer,Integer>();
		LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
		for(i=0;i<t;i++)
		{
			int y=scan.nextInt();
			if(y%2==0)
			{
				if(max<y)
				{
					max=y;
				}
				if(h.containsKey(y))
				{
					h.put(y,h.get(y)+1);
				}
				else
				{
					h.put(y,1);
				}
			}
			else
			{
				if(max<y)
				{
					max=y;
				}
				if(hm.containsKey(y))
				{
					hm.put(y,hm.get(y)+1);
				}
				else
				{
					hm.put(y,1);
				}
			}
		}
		int g=scan.nextInt();
		for(int y=0;y<g;y++)
		{
			int d=scan.nextInt();
			int m=0;
			if(max<d)
			{
				System.out.println("0");
			}
			else
			{
				if(d%2==0)
				{
					Iterator it=h.entrySet().iterator();
					while(it.hasNext())
					{
						Map.Entry pair=(Map.Entry)it.next();
						int o=(int) pair.getKey();
						if(o%d==0)
						{
							m=m+(int) pair.getValue();
						}
					}
					System.out.println(m);
				}
				else
				{
					Iterator it=h.entrySet().iterator();
					while(it.hasNext())
					{
						Map.Entry pair=(Map.Entry)it.next();
						int o=(int) pair.getKey();
						if(o%d==0)
						{
							m=m+(int) pair.getValue();
						}
					}
					Iterator it1=hm.entrySet().iterator();
					while(it1.hasNext())
					{
						Map.Entry pair=(Map.Entry)it1.next();
						int o=(int) pair.getKey();
						if(o%d==0)
						{
							m=m+(int) pair.getValue();
						}
					}
					System.out.println(m);
				}
			}
		}
	}
}