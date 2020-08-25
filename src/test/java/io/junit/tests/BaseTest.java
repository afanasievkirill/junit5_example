package io.junit.tests;

import methods.Fruit;
import methods.FruitsBasket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected FruitsBasket basket = new FruitsBasket();
    protected Fruit apple = new Fruit("Apple", 120);
    protected Fruit orange = new Fruit("Orange", 120);
    protected Fruit pear = new Fruit("Pear", 120);

    @BeforeEach
    public void init() {
        basket.add(apple);
        basket.add(orange);
        basket.add(pear);
    }

    @AfterEach
    public void destroy() {
        basket.removeAll();
    }
}
