import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {

    public static String sortedNumbers(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        System.out.println(sortedNumbers(array));
    }
}
