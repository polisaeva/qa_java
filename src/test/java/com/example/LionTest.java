package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void lionTest() {
        Lion lion = new Lion(feline);
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
        Lion lion = new Lion(feline);
        int expectedKittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensCount = lion.getKittens();
        assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);

        Mockito.verify(feline).eatMeat();
    }
}
