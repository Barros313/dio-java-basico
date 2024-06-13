import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

/*        BinaryOperator<Integer> sumNumbers = (a, b) -> a + b;

        int result = numbers.stream().reduce(0, sumNumbers);

        System.out.println("A soma dos números é: " + result);*/

        System.out.println(numbers.stream().reduce(0, Integer::sum));
    }
}
