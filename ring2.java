import java.util.Scanner;
class ring2
{
    public static void main(String[]ats)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            String ptr=scan.nNextLine();
            String str[]=ptr.split("");
            String tr=scan.nextLine();
            String mtr[]=tr.split("");
            int m=0;
            for(j=0;j<str.length;j++)
            {
                System.out.println(str[j]);
                for(k=0;k<mtr.length;k++)
                {
                    if(str[j].equals(mtr[k]))
                    {
                        m++;
                        mtr[k]="1";
                        break;
                    }
                }
            }
            int a=str.length;
            int b=mtr.length;
            if(a==m&&b>m)
            {
                System.out.println("You lose some.");             
            }
            if(a>m&&b==m)
            {
                System.out.println("You win some.");
            }
            if(a>m&&b>m)
            {
            System.out.println("You draw some.");
            }
        }
    }
}