package tests.parameterized;


import models.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SimpleTests {
    private static Stream<Arguments> testPeople() {
        return Stream.of(
                Arguments.of(new People("Vasya", 20, "male")),
                Arguments.of(new People("Dusya", 12, "male")),
                Arguments.of(new People("Kusya", 22, "male")),
                Arguments.of(new People("Yarus", 23, "male"))
        );
    }

    @Test
    @DisplayName("Подсчет суммы 21 = 21")
    void sumTest() {
        Assertions.assertEquals(21, 21, "Не равно!!!");
    }

    @Test
    @DisplayName("Проверка не корректных сумм")
    @Disabled("Указываем причину отключения кейса")
    void notEqualTest() {
        Assertions.assertEquals(21, 2, "Не равно!!!");
    }


    @ParameterizedTest
    @CsvSource({"Dgonex, 13, male", "Marex, 20, female", "Keytx, 33, male"})
    public void testName(String name, Integer age, String sex) {
        Assertions.assertTrue(name.contains("x"), "В имени не найдена буква 'x' ");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/people.csv", delimiter = ':')
    public void testNameFromFile(String name, Integer age, String sex) {
        Assertions.assertTrue(name.contains("x"), "В имени не найдена буква 'x' ");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/people.csv", delimiter = ',')
    public void delimiter(String name, Integer age, String sex) {
        System.out.println(name + " " + age + " " + sex);
        Assertions.assertTrue(name.contains("o"), "В имени не найдена буква 'x' ");
    }

    @ParameterizedTest
    @MethodSource("testPeople")
    public void testMethodSource(People p) {
        System.out.println(p.name() + " " + p.age() + " " + p.sex());
        Assertions.assertTrue(p.name().contains("ya"), "В имени не найдена буква 'x' ");
    }

    @ParameterizedTest
    @MethodSource("testPeople")
    public void testMethodSourceAge(People p) {
        System.out.println(p.name() + " " + p.age() + " " + p.sex());

    }


}
