import java.util.Stack;

public class stringss
{

	static void fun(char[] arr, int index, Stack<Character> st, int len, int k) 
	{
		st.push(arr[index]);
		if (st.size() == k) 
		{
			System.out.println(st);
			st.pop();
			return;
		}

		for (int i = 0; i < len; i++) 
		{
			fun(arr, i, st, arr.length, k);
		}

		st.pop();

	}

	public static void main(String[] args) 
	{

		Stack<Character> st = new Stack<>();

		char[] arr = { 'a', 'b'};

		int k = 3;

		for (int i = 0; i < arr.length; i++)
		{
			fun(arr, i, st, arr.length, k);
		}

	}

}