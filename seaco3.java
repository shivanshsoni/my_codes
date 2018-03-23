import java.util.*;
import java.lang.*;
import java.io.*;
 
class Command{
	int type,l,r;
}
 
 
/* Name of the class has to be "Main" only if the class is public. */
class seaco3
{
    public static void execute(int arr[],Command arrc[],Command c){
    	if(c.type==1){
    		for(int i=c.l-1;i<=c.r-1;i++){
    			arr[i]+=1;
    		}
    		return;
    	}
 
    	for(int j=c.l-1;j<=c.r-1;j++){
    		execute(arr,arrc,arrc[j]);
    	}
    	return;
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		int n = scan.nextInt();
		int q  =scan.nextInt();
		int arr[] = new int[n];
		Command arrc[] = new Command[q];
		for(int u=0;u<t;u++)
		{
			for(int i=0;i<q;i++){
			Command c = new Command();
			c.type = scan.nextInt();
			c.l = scan.nextInt();
			c.r =scan.nextInt();
			arrc[i]=c;
		}
		for(int i=0;i<q;i++){
			execute(arr,arrc,arrc[i]);
		}
		int ans = 1000000007;
		for(int i=0;i<n;i++){
			System.out.print((arr[i]%ans)+" ");
		}
		System.out.println(" ");
	}
}
}