package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeParameterizedTest {
    private String sex;
    private Boolean hasMane;

    public LionHasManeParameterizedTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[] presenceOfAMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(sex);
        assertEquals(String.format("Некорректное определение наличия гривы при вызове метода doesHaveMane() для пола " +
                        "%s. Ожидаемое значение: %s. Фактические значение: %s", sex, hasMane, lion.doesHaveMane()),
                        hasMane, lion.doesHaveMane());
    }
}