package solution;

public class NonNegative {
    public int findIntegers(int num) {
        if (num < 0) {
            return 0;
        }

        // Step 1: Get the binary format of num
        // Notice that the binary format is reversed, that is LSB is at the beginning
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if ((num & 1) == 1) {
                sb.append(1);
            }
            else {
                sb.append(0);
            }
            num >>>= 1;
        }

        String bit = sb.toString();
        int n = bit.length();

        // Step 2: Count number of binary without consecutive ones with length n 
        // Idea: https://www.geeksforgeeks.org/count-number-binary-strings-without-consecutive-1s/

        // Binary without consecutive one that ends with one
        int[] ones = new int[n];
        // Binary without consecutive one that ends with zero
        int[] zeroes = new int[n];
        ones[0] = 1;
        zeroes[0] = 1;

        for (int i = 1; i < n; i++) {
            zeroes[i] = ones[i - 1] + zeroes[i - 1];
            ones[i] = zeroes[i - 1];
        }

        // Total number of binary without consecutive ones with length n
        int total = ones[n - 1] + zeroes[n - 1];


        // Step 3: Remove binary without consecutive ones which is greater than num
        // Check this from Most Significant Bit to Least Significant Bit
        for (int i = n - 2; i >= 0; i--) {
            // When we find consecutive 1s in the binary format, we know total doesn't contain bianry consecutive ones
            // So we break here
            if (bit.charAt(i) == '1' && bit.charAt(i + 1) == '1') break;

            // When we find consecutive 0s in the binary format, we need to substract the binary format ending with one at length
            // i, for example with length 3, when number is 8 (whose binary format is 100), the total will count into 101,
            // so we need to remove the case 101 since it is greater than 8
            if (bit.charAt(i) == '0' && bit.charAt(i + 1) == '0') total -= ones[i];
        }
        return total;
    }
    
    public static void main(String[] args) {
    	
    	NonNegative nn = new NonNegative();
    	
    	System.out.print(nn.findIntegers(2));
    	
    }
}
