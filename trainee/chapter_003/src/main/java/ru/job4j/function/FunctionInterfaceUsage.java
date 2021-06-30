package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        //Supplier
/*        Supplier<String> sup = () -> "New String For Interface";
        System.out.println(sup.get());*/

/*        //Consumer
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept(sup.get());

        //BiConsumer
        BiConsumer<String, String> consumerBi = (s, s1) -> System.out.println(s + s1);
        consumerBi.accept(sup.get(), " and Second String");*/

   /*     List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup1 = () -> new HashSet<>(list);
        Set<String> strings = sup1.get();
        for (String s : strings) {
            System.out.println(s);
        }*/

      /*  List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup = () -> new HashSet<>(list);
        BiConsumer<Integer, String> consumer = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = sup.get();
        int i = 1;
        for (String s : strings) {
            consumer.accept(i++, " is " + s);
        }*/

    /*    Predicate<String> pred = s -> s.isEmpty();
        System.out.println("Строка пустая: " + pred.test(""));
        System.out.println("Строка пустая: " + pred.test("test"));

        BiPredicate<String, Integer> cond = (s, i) -> s.contains(i.toString());
        System.out.println("Строка содержит подстроку: " + cond.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + cond.test("Name", 123));*/

        Function<String, Character> func = s -> s.charAt(2);
        System.out.println("Третий символ в строке: " + func.apply("first"));
        System.out.println("Третий символ в строке: " + func.apply("second"));

        BiFunction<String, Integer, String> biFunc = (s, i) -> s.concat(" ").concat(i.toString());
        System.out.println("Результат работы бифункции: " + biFunc.apply("Name", 123));
        System.out.println("Результат работы бифункции: " + biFunc.apply("String number", 12345));

    /*    UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка поле реверса: " + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка поле реверса: " + builder.apply(new StringBuilder("tset rof gnirtS")));*/

        BinaryOperator<StringBuilder> builder = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println(
                "Строка после объединения: " + builder.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}