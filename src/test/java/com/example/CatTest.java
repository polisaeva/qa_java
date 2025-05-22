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
public class CatTest {

    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void initCat() {
        cat = new Cat(feline);
    }

    @Test
    public void catTest() {
        assertEquals("После создания Cat через конструктор, поле 'predator' должно быть равно переданному " +
                "Feline", feline, cat.predator);
    }

    @Test
    public void getSoundTest() {
        Feline feline = new Feline();
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals("Метод getSound() у объекта класса Cat должен возвращать 'Мяу'",
                expectedSound, actualSound);
    }


    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();
        assertEquals("Для объекта класса Cat метод getFood() должен возвращать список еды для хищников",
                expectedFood, actualFood);
    }

    @Test
    public void getFoodVerifyTest() throws Exception {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

}