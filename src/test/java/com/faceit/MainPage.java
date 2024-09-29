package com.faceit;
/*
    Main page faceit.com
 */


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement playerInput = $x
            ("//*[@id=\"main-header-height-wrapper\"]/div/div/div/div[3]/div[1]/div[1]/div/div/input");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void search(String searchString) {
        playerInput.setValue(searchString);
        playerInput.sendKeys(Keys.ENTER);
    }
}
