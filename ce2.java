import java.util.Scanner;
class ce2
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        StringBuilder ptr=new StringBuilder("");
        for(i=0;i<t;i++)
        {
            String str=scan.next();
            ptr=ptr.append(str);
        }
        String mtr=ptr.toString();
        char A[]=mtr.toCharArray();
        j=mtr.length();
        int m=0;
        for(k=0;k<j;k++)
        {
            for(l=0;l<j;l++)
            {
                if(A[k]==A[l]&&k!=l&&A[k]!='E')
                {
                    A[l]='E';
                }
            }
        }
        for(int a=0;a<j;a++)
        {
            System.out.println(A[a]);
            if(A[a]!='E')
            {
                m++;
            }
        }
        System.out.println(m+1);
    }
}