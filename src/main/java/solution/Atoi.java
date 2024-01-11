package solution;

public class Atoi {
	
	public int myAtoi(String s) {
		
		int sign = 1, base = 0, i = 0;
		
		if(s.trim().isEmpty())
			return 0;
		
		while(s.charAt(i) == ' ')
			i++;
		
		if(s.charAt(i) == '-' || s.charAt(i) == '+')
			sign = 1 - 2 * (s.charAt(i++) == '-' ? 1 : 0);
		
		while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			if(base > Integer.MAX_VALUE / 10
				|| (base == Integer.MAX_VALUE / 10
					&& s.charAt(i) - '0' > 7))
					if(sign == 1)
						return Integer.MAX_VALUE;
					else
						return Integer.MIN_VALUE;
			
			base = 10 * base + (s.charAt(i++) - '0');
		}
		
		return base * sign;
	}

	public static void main(String[] args) {
		
		Atoi a = new Atoi();
		
		System.out.printf("%d", a.myAtoi(" "));
 	}
}
