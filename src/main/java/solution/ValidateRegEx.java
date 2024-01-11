package solution;

import java.util.regex.Pattern;

public class ValidateRegEx {
	
	public static void main(String[] args) {
		try {
		Pattern pat = Pattern.compile("^(.+)@example.com$");
		System.out.println("Valid");
		}
		catch(Exception e) {
			System.out.println("Invalid");
		}
	}

}
