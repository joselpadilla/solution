package solution;

public class BitOperators {
	public static long divide(long dividend,
            long divisor)
{

long sign= (dividend < 0) ^ (divisor < 0) ? -1:1;

divisor = Math.abs(divisor);
dividend = Math.abs(dividend);

long q=0, t=0;

for(int i = 31; i >= 0; i--) {
	if(t + (divisor << i) <= dividend) {
		t +=(divisor << i);
		q |= 1L << i;
	}
}

return (q * sign);
}

//Driver code
public static void main(String args[])
{
int a = 10, b = 3;
System.out.println(divide(a, b));

int a1 = 43, b1 = -8;
System.out.println(divide(a1, b1));


}
}