package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {

    @Test
    public void alexTest() throws Exception {
        Alex alex = new Alex();
        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex();
        List<String> expectedListAlexFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualListAlexFriends = alex.getFriends();
        assertEquals(expectedListAlexFriends, actualListAlexFriends);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex();
        String expectedPlaceOfResidence = "Нью-Йоркский зоопарк";
        String actualPlaceOfResidence = alex.getPlaceOfLiving();
        assertEquals(expectedPlaceOfResidence, actualPlaceOfResidence);
    }

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex();
        int expectedCountKittens = 0;
        int actualCountKittens = alex.getKittens();
        assertEquals(expectedCountKittens, actualCountKittens);
    }


}