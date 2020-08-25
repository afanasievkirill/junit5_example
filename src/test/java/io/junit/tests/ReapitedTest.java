package io.junit.tests;


import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Feature("Проверяем запуск повторяющихся тестов")
@Tag("JunitTests")
public class ReapitedTest {

    @RepeatedTest(5)
    @DisplayName("Запускаем тест 5 раз")
    void repitedTest(){
        System.out.println("repitedTests");
    }
}
