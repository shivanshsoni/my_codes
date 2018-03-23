import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket {
    Bracket(char type, int pos) {
        this.type = type;
        this.pos = pos;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int pos;
}

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
		
		int error_pos = 0;

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        for (int pos = 0; pos < text.length(); ++pos) {
            char next = text.charAt(pos);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
				Bracket b = new Bracket(next, pos+1);
				opening_brackets_stack.push(b);
            }

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
				if(opening_brackets_stack.empty()) {
					error_pos = pos + 1;
					break;
				}
				Bracket top = opening_brackets_stack.pop();
				if(!top.Match(next)) {
					error_pos = pos + 1;
					break;
				}
			}
        }

        // Printing answer, write your code here
		if(error_pos==0 && opening_brackets_stack.empty())
			System.out.println("Success");
		else {
			if(error_pos == 0) {
				while(opening_brackets_stack.size()>1)
					opening_brackets_stack.pop();
				error_pos = opening_brackets_stack.peek().pos;
			}
			System.out.println(error_pos);
		}
    }
}