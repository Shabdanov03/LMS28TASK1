import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {1, 4, 6, 9, 11, 8, 7, 6, 5, 12, 2, 3};
        Stream<Integer> massiv = Stream.of(array);
        Stream<Integer> integerStream = massiv.filter(x -> x % 2 == 0).map(x -> x * x);
        integerStream.max(Comparator.comparing(x -> x)).stream().toList().forEach(System.out::println);

    }
}