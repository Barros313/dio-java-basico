import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SuplierExample {
    public static void main(String[] args) {

        List<String> helloList = Stream.generate(() -> "Hello world!").limit(5).toList();

        helloList.forEach(System.out::println);
    }
}
