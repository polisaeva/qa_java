package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeParameterizedTest {
    private String sex;
    private Boolean hasMane;
    private Feline feline = null;

    public LionHasManeParameterizedTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Тест №{index}: для пола {0} ожидаемый результат {1}")
    public static Object[] presenceOfAMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(String.format("Некорректное определение наличия гривы при вызове метода doesHaveMane() для пола " +
                        "%s. Ожидаемое значение: %s. Фактические значение: %s", sex, hasMane, lion.doesHaveMane()),
                        hasMane, lion.doesHaveMane());
    }
}