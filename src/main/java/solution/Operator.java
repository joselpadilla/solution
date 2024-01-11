package solution;

@FunctionalInterface
interface Operator<T> {
    T process(T a, T b);
}