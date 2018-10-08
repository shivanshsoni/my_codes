import java.util.Scanner;
class code24
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		String A="bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba";
		String B="babaaa";
		System.out.println(strStr(A,B));
	}
	public static int strStr(final String A, final String B) {
        int j=0;
        int start=-1;
        for(int i=0;i<A.length();i++)
        {
        	//System.out.println(i+" "+ B.charAt(j)+" "+A.charAt(i));
            if(j<B.length() && B.charAt(j)==A.charAt(i))
            {
                if(start==-1)
                {
                    start=i;
                }
                j++;
                if(j==B.length())
                {
                    return start;
                }
            }
            else
            {
                start=-1;
                j=0;
                if(j<B.length() && B.charAt(j)==A.charAt(i))
                {
                	if(start==-1)
                {
                    start=i;
                }
                j++;
                if(j==B.length())
                {
                    return start;
                }
                }
            }
        }
        return -1;
    }
}
