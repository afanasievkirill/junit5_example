package io.junit.tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

@Feature("Проверяем запуск повторяющихся тестов")
@DisplayName("Проверяем запуск повторяющихся тестов")
@Owner("afanasievkirill")
@Tag("JunitTests")
public class ReapitedTest {

    @RepeatedTest(5)
    @DisplayName("Запускаем тест 5 раз")
    void repitedTest() {
        System.out.println("repitedTests");
    }
}
