import java.util.Scanner;
class he1
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            String str=scan.nextLine();
            String mtr=scan.nextLine();
            String ptr1[]=str.split("\\str");
            String ptr2[]=mtr.split("\\mtr");
            int p=0;
            for(j=0;j<ptr1.length;j++)
            {
                for(k=0;k<ptr2.length;k++)
                {
                    if(ptr1[j].equals(ptr2[k]))
                    {
                        p++;
                    }
                }
            }
            if(p<(ptr1.length)-1&&p<(ptr2.length)-1)
            {
                System.out.println("You draw some.");
            }
            if(p==(ptr1.length)-1&&p<(ptr2.length)-1)
            {
                System.out.println("You lose some.");
            }
            if(p<(ptr1.length)-1&&p==(ptr2.length)-1)
            {
                System.out.println("You win some");
            }
        }
    }
}