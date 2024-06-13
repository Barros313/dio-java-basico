import java.util.Arrays;
import java.util.List;

public class Challenger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /* Ordem crescente */
        /*numbers.stream().sorted().forEach(System.out::println);*/

        /*Mostrar resultado da soma dos números pares*/
        /*numbers.stream().filter(x -> x % 2 == 0).reduce(Integer::sum).ifPresent(System.out::println);*/

        /*Verifica se todos os números são positivos*/
        /*System.out.println(numbers.stream().allMatch(x -> x > 0));*/

        /*Remover números impares da lista*/
        /*numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);*/

        /*Média dos valores maiores que 5*/

    }
}
