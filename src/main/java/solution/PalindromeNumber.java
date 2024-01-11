package solution;

public class PalindromeNumber {
	
	public boolean isPalindrome(int n) {
		
		String s = Integer.toString(n);
		String p = "";
		
		for(int i = s.length()-1; i >= 0; i--)
			p += s.charAt(i);
		
		if(s.equals(p))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		
		System.out.println(pn.isPalindrome(-101));
	}
}
