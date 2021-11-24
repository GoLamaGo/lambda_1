import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //при делении на ноль возникает ArithmeticException.
    // Чтобы программа не прекращала работу нештатно, можно перехватить исключение
    //что в таком случае возвращать, не понятно
    BinaryOperator<Integer> divide = (x, y) -> {
        int i = -1;
        try {
            i = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is prohibited");
        }
        return i;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
