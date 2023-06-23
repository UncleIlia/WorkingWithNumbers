import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public void main() {
        List<Integer> intList = Stream.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4)
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(intList);
    }
}
