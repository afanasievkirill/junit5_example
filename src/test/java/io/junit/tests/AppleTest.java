package io.junit.tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("Проверяем передачу параметров из Дженкинса или Консоли")
@DisplayName("Проверяем передачу параметров из Дженкинса или Консоли")
@Owner("afanasievkirill")
@Tag("ParametrizedTest")
public class AppleTest {

    static Logger logger = LoggerFactory.getLogger(AppleTest.class);

    @Test
    @Tag("ParametrizedTest")
    void paramitrizedStringTest() {
        String item = System.getProperty("item", "orange"); // from terminal, gradle apple_tests -Ditem=apple
        logger.info("\nitem = " + item);

        assertEquals("apple", item, "item = " + item);
    }
}

