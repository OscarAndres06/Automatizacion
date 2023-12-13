package com.haceb.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Espera {

    public static void espera(WebDriver webDriver, WebElementFacade webElementFacade) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(15));
        wait.until(
                ExpectedConditions.elementToBeClickable(webElementFacade)
        );
    }
    public static void espera2(WebDriver webDriver, WebElementFacade webElementFacade) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(9));
        wait.until(
                ExpectedConditions.elementToBeClickable(webElementFacade)
        );
    }
}
