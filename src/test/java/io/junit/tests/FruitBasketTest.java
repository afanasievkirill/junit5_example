package io.junit.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import methods.Fruit;
import methods.FruitsBasket;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;

import java.time.Duration;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@Feature("Проверяем работу Корзины")
@Story("Проверяем работу Корзины")
@Owner("afanasievkirill")
@Tag("BasketTests")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FruitBasketTest extends BaseTest {



    @Test
    @DisplayName("Проверяем количество элементов в Корзине")
    public void testSize() {
        assertEquals(3, basket.getSize(), "Checking basket's size");
    }

    @Test
    @DisplayName("Проверяем добавление Элемента в Корзину")
    public void testAdd() {
        basket.add(new Fruit("Banana", 200));
        assertEquals(4, basket.getSize(), "Adding one more fruit to the basket");
    }

    @Test
    @DisplayName("Проверяем Удаление элемента из Корзины")
    public void testRemove() {
        basket.remove(orange);
        assertEquals(2, basket.getSize(), "Removing a fruit from the basket");
    }

    @Test
    @DisplayName("Проверяем исключение при попытке удаления не существующего элемента")
    public void testRemoveException() {
        assertThrows(NoSuchElementException.class,
                () -> basket.remove(new Fruit("Kiwi", 80)),
                "Removing a fruit from the basket");
    }

}
