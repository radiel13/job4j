package ru.job4j.Stragery;

<<<<<<< HEAD
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.StringJoiner;

public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
//31211
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
=======
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в память для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
>>>>>>> 0516093e27e5aff555d9c65b5df697d28a98a562
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++")
                                .add("+  +")
                                .add("+  +")
                                .add("++++")
                                .add(System.lineSeparator())
                                .toString()
                )
        );
<<<<<<< HEAD
=======
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
>>>>>>> 0516093e27e5aff555d9c65b5df697d28a98a562
    }

    @Test
    public void whenDrawTriangle() {
<<<<<<< HEAD
        new Paint().draw(new Triangle());
=======
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в память для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Triangle());
        // проверяем результат вычисления
>>>>>>> 0516093e27e5aff555d9c65b5df697d28a98a562
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("   +")
                                .add("  +  +")
                                .add(" +    +")
                                .add("++++++++")
                                .add(System.lineSeparator())
                                .toString()
                )
        );
<<<<<<< HEAD
=======
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
>>>>>>> 0516093e27e5aff555d9c65b5df697d28a98a562
    }
}