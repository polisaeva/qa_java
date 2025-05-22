package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    private Feline feline;

    @Before
    public void initFeline() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(String.format(
                        "Для класса Feline метод eatMeat() должен возвращать список еды для хищников: %s. " +
                        "Фактический результат: %s", expectedFood, actualFood),
                                                     expectedFood, actualFood);
    }

    @Test
    public void getFamilyTest() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("Метод getFamily() для объектов класса Feline должен возвращать 'Кошачьи'",
                expectedFamily, actualFamily);
    }

    @Test
    public void getKittensTest() {
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals(String.format("Для объекта класса Feline метод getKittens() должен возвращать количество котят: %d. " +
                        "Фактическое количество котят: %d", expectedCount, actualCount),
                                                            expectedCount, actualCount);
    }

}