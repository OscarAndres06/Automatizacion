package com.haceb.step;

import com.haceb.pageObject.PaginaRegistroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import static com.haceb.utils.Espera.espera;

public class ValidacionSteps {

    @Page
    PaginaRegistroPage paginaRegistroPage;

    @Step("completar el formulario de registro")
    public void validacionPerfil() {
        for (String windowHandle : paginaRegistroPage.getDriver().getWindowHandles()) {
            if (!paginaRegistroPage.getDriver().getWindowHandle().contentEquals(windowHandle)) {
                paginaRegistroPage.getDriver().switchTo().window(windowHandle);
                break;
            }
        }

        espera(paginaRegistroPage.getDriver(),paginaRegistroPage.inputValidarPerfil);
        Assert.assertTrue(paginaRegistroPage.inputValidarPerfil.isDisplayed());

    }

}
