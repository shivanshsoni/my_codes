import java.util.Scanner;
import java.util.*;

class arraylist
{
	public static void main(String[]args)
	{
		int n=6;
		ArrayList<Integer> arrayli=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			arrayli.add(i);
		}
		System.out.println(arrayli);

		arrayli.remove(4);

		System.out.println(arrayli);

		for(int j=0;j<arrayli.size();j++)
		{
			System.out.print(arrayli.get(j)+" ");
		}
	}
}