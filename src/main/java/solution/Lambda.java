package solution;

public class Lambda {

    public static void main(String[] args) {
        Operator<Integer> addOperation = (a, b) ->  a + b;
        System.out.println(addOperation.process(3, 3));     //Prints 6

        Operator<String> appendOperation = (a, b) ->  a + b;
        System.out.println(appendOperation.process("3", "3"));  //Prints 33

        Operator<Integer> multiplyOperation = (a, b) ->  a * b;
        System.out.println(multiplyOperation.process(3, 3));    //Prints 9

    }
}
