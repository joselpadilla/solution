package solution;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        Predicate<Integer> integerPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };
        Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        Consumer<Integer> println = System.out::println;
        numbers.stream()
                .filter(integerPredicate2)
                .map(integerIntegerFunction)
                .forEach(println);
    }

}
