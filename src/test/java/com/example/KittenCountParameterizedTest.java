package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class KittenCountParameterizedTest {
    private int actualCount;
    private int expectedCount;

    public KittenCountParameterizedTest(int actualCount, int expectedCount) {
        this.actualCount = actualCount;
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Object[] getKittensCount() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 2},
                {10, 10}
        };
    }

    @Test
    public void ShouldBeEqual() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens(actualCount);
        assertEquals(expectedCount, kittensCount);
    }
}