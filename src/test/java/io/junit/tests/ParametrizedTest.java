package io.junit.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Feature("Проверяем запуск параметризованных тестов")
@Story("Проверяем запуск параметризованных тестов")
@Owner("afanasievkirill")
@Tag("JunitTests")
public class ParametrizedTest {

    @ParameterizedTest()
    @ValueSource(strings = {"_", "asas"})
    @DisplayName("В параметризованном тесте проверяем, что значение стринги больше нуля")
    void stringGreatherThenZeroTest(String value) {
        assertTrue(value.length() > 0);
    }
}
