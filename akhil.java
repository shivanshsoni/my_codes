import java.util.Scanner;
import java.util.Arrays;
class akhil
{
    public static void main(String[]ars)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            String str=scan.next();
            char A[]=str.toCharArray();
            Arrays.sort(A);
            k=str.length();
            if(k%2!=0)
            {
                System.out.println("-1");
            }
            else
            {
                int m=0;
                for(j=0;j<k-1;j++)
                {
                    if(A[j]==A[j+1])
                    {
                        m++;
                    }
                    else
                    {
                        break;
                    }
                }
                int f=0;
                for(l=0;l<k;l=l+m+1)
                {
                    int p=0;
                    for(int y=l;y<l+m;y++)
                    {
                        if(A[y]==A[y+1])
                        {
                            p++;
                        }
                    }
                    if(p!=m)
                    {
                        f=1;
                        break;
                    }
                }
                if(m+1==k)
                {
                    System.out.println("1");
                }
                if(f==1)
                {
                    System.out.println("-1");
                }
                if(f==0&&m+1<k)
                {
                    if(m+1%2==0)
                    {
                        System.out.println("1");
                    }
                    else
                    {
                        System.out.println(m);
                    }
                }
            }
        }
    }
}