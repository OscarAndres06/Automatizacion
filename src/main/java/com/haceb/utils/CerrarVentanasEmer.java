package com.haceb.utils;



import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;



public class CerrarVentanasEmer {

    public static void ventanaEmergente( WebElementFacade webElementFacade){
        try{
            boolean visible = webElementFacade.isDisplayed();
            if(visible){
                webElementFacade.click();
            }
        }catch (
                NoSuchElementException ignored){

        }
    }


}
