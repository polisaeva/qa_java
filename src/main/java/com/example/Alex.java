package com.example;

import java.util.List;

public class Alex extends Lion {


    public Alex() throws Exception {
        super("Самец");
    }

public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

public String getPlaceOfLiving() {
        String placeOfResidence = "Нью-Йоркский зоопарк";
        return placeOfResidence;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}