import java.util.Scanner;
class passwords
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        String str[]=new String[t];
        String ptr[]=new String[t];
        for(i=0;i<t;i++)
        {
            str[i]=scan.next();
            StringBuilder s=new StringBuilder(str[i]).reverse();
            ptr[i]=s.toString();
        }
        for(j=0;j<t;j++)
        {
            for(k=0;k<t;k++)
            {
                if(str[j].equals(ptr[k]))
                {
                    l=str[j].length();
                    System.out.println(l+" "+str[j].charAt(l/2));
                }
            }
        }
    }
}