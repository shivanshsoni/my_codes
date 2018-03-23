import java.util.Scanner;
class strings
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int p=scan.nextInt();
		k=scan.nextInt();
		char set[]=new char[t];
		char ch='a';
		for(i=0;i<t;i++)
		{
			set[i]=ch;
			ch++;
		}
		printAllKLength(set, p);
	}
	static void printAllKLength(char set[], int k) 
	{
        int n = set.length;        
        String htr=printAllKLengthRec(set, "", n, k);
        return htr;
    }

    static String newPrefix=""; 

    static String printAllKLengthRec(char set[], String prefix, int n, int k) 
    {
    	//String newPrefix;
 		for (int i = 0; i < n; ++i) 
 		{
            newPrefix = prefix.append(Character.toString(set[i]));
            printAllKLengthRec(set, newPrefix, n, k - 1);
            //return newPrefix; 
        }
        return newPrefix;
    }
}