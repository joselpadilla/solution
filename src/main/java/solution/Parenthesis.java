package solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Parenthesis {
	
	public static boolean validate(String s) {
		
		Deque<Character> stack = new ArrayDeque<>();
		
		for(int i=0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char check;
			
			switch(c) {
			case ')' :
				check = stack.pop();
				if(check == '{' || check == '[')
					return false;
				break;
			case '}' :
				check = stack.pop();
				if(check == '(' || check == '[')
					return false;
				break;
			case ']' :
				check = stack.pop();
				if(check == '{' || check == ')')
					return false;
				break;
			}
		}
		
		return stack.isEmpty();
		
	}
	public static void main(String[] args) {
		System.out.println(validate("({[123]})(())"));
	}
}
