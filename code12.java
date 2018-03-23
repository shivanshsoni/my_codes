import java.util.Scanner;
class code12
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int i,j,k,l,t;
        t=scan.nextInt();
        for(i=0;i<2;i++)
        {
            if(i==0)
            {
                String str=scan.nextLine();
            }
            else
            {
                Staering str=scan.nextLine();
                if(str.contains("12"))
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }    
            }
        }
    }
}