import java.util.Scanner;
class code7
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int n=scan.nextInt();
            String str[]=new String[n];
            int p=0;
            int a=0;
            int b=0;
            for(j=0;j<n;j++)
            {
                str[j]=scan.next();
                char A[]=str[j].toCharArray();
                if(p==0)
                {
                    for(k=0;k<str[j].length();k++)
                    {
                        if(A[k]=='*')
                        {
                            p=1;
                            a=j;
                            b=k;
                            break;
                        }
                    }
                }
            }
            //System.out.println(a+" "+b);
            int n1=n/2;
            int n2=n/2;
            if(a>n/2)
            {
                n1=n1+n/2;
                a=a-n/2;
            }
            if(b>n/2)
            {
                n2=n2+n/2;
                b=b-n/2;
            }
            System.out.println(n1+n2-a-b);
        }
    }
}