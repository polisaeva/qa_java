package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {

    @Test
    public void alexTest() throws Exception {
        Alex alex = new Alex();
        assertTrue("Алекс - самец, поэтому у него должна быть грива", alex.doesHaveMane());
    }

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex();
        List<String> expectedListAlexFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualListAlexFriends = alex.getFriends();
        assertEquals(String.format(
                        "Ожидаемый список друзей Алекса: %s. Фактический результат: %s",
                        expectedListAlexFriends, actualListAlexFriends),
                        expectedListAlexFriends, actualListAlexFriends);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex();
        String expectedPlaceOfResidence = "Нью-Йоркский зоопарк";
        String actualPlaceOfResidence = alex.getPlaceOfLiving();
        assertEquals(String.format(
                        "Место жительства льва Алекса: %s. Фактический результат: %s",
                        expectedPlaceOfResidence, actualPlaceOfResidence),
                        expectedPlaceOfResidence, actualPlaceOfResidence);
    }

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex();
        int expectedCountKittens = 0;
        int actualCountKittens = alex.getKittens();
        assertEquals("У Алекса не должно быть львят",
                expectedCountKittens, actualCountKittens);
    }


}