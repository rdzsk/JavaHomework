import java.util.Iterator;
import java.util.stream.Stream;

public class Task5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();
        return Stream.iterate(0, i -> i + 1)
                .takeWhile(i -> it1.hasNext() && it2.hasNext())
                .flatMap(i -> Stream.of(it1.next(), it2.next()));
    }

    public static void main(String[] args) {
        zip(Stream.of(1, 2, 3, 4), Stream.of(10, 20, 30))
                .forEach(System.out::println);
    }
}
