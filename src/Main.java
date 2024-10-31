import java.io.Serializable;
import java.util.function.*;

public class Main {
    public interface NestedInterface {
        default void nestedMethod( ) {
            System.out.println(" nested method");
        }
    }
    public static void main(String[] args) {
        NestedInterface nestedInterface = new NestedInterface() {};
        nestedInterface.nestedMethod();
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Hello World");


        IntConsumer intConsumer = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        };
        intConsumer.accept(5);
        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {

            @Override
            public void accept(String s, Integer integer) {
                System.out.println("s: " + s + " integer: " + integer);
            }
        };
        biConsumer.accept("Stringggg", 5);

        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println(predicate.test(5));
        IntPredicate intPredicate = new IntPredicate() {

            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        };
        System.out.println(intPredicate.test(6));


        Function<String, Integer> function = new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(function.apply("Hello World"));
        UnaryOperator<String> unaryOperator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s + "asdfsdgl";
            }
        };
        System.out.println(unaryOperator.apply("Hello World"));
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        System.out.println(binaryOperator.apply(5, 6));
        Supplier<String> supplier = new Supplier() {
            @Override
            public Object get() {
                return "supplier";
            }
        };
        System.out.println(supplier.get());
    }
}
