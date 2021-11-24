public class Main {

    public static void main(String[] args) {

        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(2, 1);
        int b = calculator.minus.apply(1, 1);
        int c = calculator.divide.apply(a, b);

        calculator.println.accept(c);
    }

}
