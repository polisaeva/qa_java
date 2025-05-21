package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Lion lion;

    @Mock
    Feline feline;

    @Before
    public void initLion() {
        lion = new Lion(feline);
    }

    @Test
    public void lionTest() {
        assertEquals(feline, lion.predator);
    }

    @Test
    public void lionConstructorShouldThrowExceptionForInvalidSex() throws Exception {
        try {
            Lion lion = new Lion("Female");
            fail("Должно было появиться исключение о недопустимом значении пола");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void getKittensTest() {
        int expectedKittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensCount = lion.getKittens();
        assertEquals(String.format("При вызове метода getKittens() для объекта класса Lion ожидаемое количество " +
                "котят %d, фактическое количество %d", expectedKittensCount, actualKittensCount),
                expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals("Для объекта класса Lion метод getFood() должен возвращать список еды для хищников",
                expectedFood, actualFood);

        Mockito.verify(feline).eatMeat();
    }
}
