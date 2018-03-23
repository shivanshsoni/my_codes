import java.util.HashSet;
 
class Subsequence 
{
	public static void main(String[]args)
	{
    	static HashSet<String> st = new HashSet<>();
    	int p=0;
    	String str=scan.next();
    	String ptr;
        for (int i = 0; i < str.length(); i++) 
        {
            for (int j = str.length(); j > i; j--) 
            {
                String sub_str = str.substring(i, j);
             
                if (!st.contains(sub_str))
                    st.add(sub_str);
            	for (int k = 1; k < sub_str.length() - 1; k++) 
            	{
                    StringBuffer sb = new StringBuffer(sub_str);
                    sb.deleteCharAt(k);
                    if (!st.contains(sb));
                    	subsequence(sb.toString());
                    else
                    	if()
            	}
            }
        }
    }
}