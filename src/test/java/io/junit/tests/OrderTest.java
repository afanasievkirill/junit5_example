package io.junit.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

@Feature("Проверяем последовательный запуск тестов (Сценарное тестирование)")
@DisplayName("Проверяем последовательный запуск тестов (Сценарное тестирование)")
@Owner("afanasievkirill")
@Tag("JunitTests")
public class OrderTest {

    @Test
    @Order(1)
    @DisplayName("Проверяем что данный тест первым отобразился в группе")
    void firstTest(TestInfo info) {
        System.out.println("This is First test");
        System.out.println(info.getDisplayName());
    }

    @Test
    @Order(2)
    @DisplayName("Проверяем что данный тест вторым отобразился в группе")
    void maybeSecondTest() {
        System.out.println("This is Second test");
    }

    @Test
    @Order(3)
    @DisplayName("Проверяем что данный тест вторым отобразился в группе")
    void ohhTest() {
        System.out.println("This is Third test");
    }
}
