package com.faceit;

import org.junit.jupiter.api.Test;

public class FaceitTest extends BaseClass {
    private final static String URL = "https://www.faceit.com";
    private final static String SEARCH_PLAYER = "s1mple";


    @Test
    public void checkPlayerStatistics() {
        MainPage mainPage = new MainPage(URL);
        mainPage.search(SEARCH_PLAYER);
    }
}
