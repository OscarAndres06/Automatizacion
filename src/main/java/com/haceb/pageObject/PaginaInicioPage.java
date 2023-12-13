package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaginaInicioPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//a[@aria-label='close window']")
    public static WebElementFacade cerarVentana;
}
