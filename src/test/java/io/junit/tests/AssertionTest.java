package io.junit.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import methods.Fruit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Feature("Проверяем работу ассертов Junit5")
@Story("Проверка Ассетров библиотеки Junit5")
@Owner("afanasievkirill")
@Tag("JunitTests")
public class AssertionTest extends BaseTest {

    @Test
    @DisplayName("Проверяем ассертТаймаут")
    void testForTimeout() {
        assertTimeout(
                Duration.ofMillis(10),
                () -> Thread.sleep(2),
                () -> "Testing of productivity"
        );
    }

    @Test
    @DisplayName("Проверяем существование объекта")
    void testAssertNull() {
        basket = null;
        assertNull(basket, "Checking if the basket is Null");
    }

    @Test
    @DisplayName("Проверяем добавление Коллекции в Корзину")
    void testForTrue() {

        List<Fruit> aLot = Arrays.asList(
                new Fruit("apple", 50),
                new Fruit("pinnaple", 60)
        );
        assertTrue(
                basket.addALot(aLot),
                "Adding a lot of fruits"
        );
    }

    @Test
    @DisplayName("Проверяем регулярку")
    void testArray(){
        String text = "В небе Боннер!";
        String[] expected = {"В", "небе", "Боннер!"};
        String[] actual = basket.greet(text);
        assertArrayEquals(actual, expected);
    }
}
