import java.util.Scanner;
import java.util.Arrays;
class abcd
{
    public static void main(String[]ars)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            String str=scan.next();
            if(str.length()<26)
            {
                System.out.println("NO");
            }
            else
            {
                int m=0;
                char A[]=str.toCharArray();
                Arrays.sort(A);
                for(char ch='a';ch<='z';ch++)
                {
                    int p=0;
                    for(k=0;k<str.length();k++)
                    {
                        if(A[k]==ch)
                        {
                            p=1;
                        }
                        if(p==1)
                        {
                            break;
                        }
                    }
                    if(p==1)
                    {
                        m++;
                        //System.out.println(m);
                    }
                }

                if(m==26)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
    }
}