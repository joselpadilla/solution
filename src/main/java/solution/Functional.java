package solution;

import java.util.Arrays;

public class Functional {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int[] evenArray = Arrays.stream(array).filter(e -> e % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(evenArray));
    }
}
