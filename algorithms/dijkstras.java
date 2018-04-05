import java.util.Scanner;
class dijkstras
{
	public static void main(String[]arhs)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Vertex:");
		int v=scan.nextInt();
		int A[][]=new int[v][v];
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				System.out.println("Enter the A["+i+"]["+j+"]:");
				A[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the source");
		int src=scan.nextInt();
		int dist[]=new int[v];
		boolean splset[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			dist[i]=Integer.MAX_VALUE;
			splset[i]=false;
		}
		dist[src]=0;

		for(int count=0;count<v-1;count++)
		{
			int min = Integer.MAX_VALUE, min_index=-1;
   			for (int vs = 0; vs < v; vs++)
   			{
     			if (splset[vs] == false && dist[vs] <= min)
     			{
      	 	 		min = dist[vs];
      	 	 		min_index = vs;
     			}
     		}
     		splset[min_index]=true;
     		for(int y=0;y<v;y++)
     		{
     			if(!splset[y] && A[min_index][y]!=0  && dist[min_index]!=Integer.MAX_VALUE && dist[min_index]+A[min_index][y] < dist[y])
     			{
     				dist[y] = dist[min_index] + A[min_index][y];
     			}
     		}
		}
		for(int i=0;i<v;i++)
		{
			System.out.println(i+"  -->>  "+dist[i]);
		}
	}
}