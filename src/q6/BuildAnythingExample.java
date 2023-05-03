package q6;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuildAnythingExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 3;
        Consumer<Integer> consumer = System.out::println;
        Consumer<Exception> exceptionConsumer = e -> System.err.println("Il y a une exception: " + e.getMessage());

        buildAnything(supplier, consumer, exceptionConsumer);
    }
    public static <T> void buildAnything(Supplier<T> supplier, Consumer<T> consumer, Consumer<Exception> exceptionConsumer) {
        try {
            T value = supplier.get();
            consumer.accept(value);
        } catch (Exception e) {
            exceptionConsumer.accept(e);
        }
    }
}
