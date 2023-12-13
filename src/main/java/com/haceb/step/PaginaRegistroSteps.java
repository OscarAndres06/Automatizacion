package com.haceb.step;

import com.haceb.pageObject.PaginaRegistroPage;
import org.openqa.selenium.support.ui.Select;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import com.haceb.utils.Data;



public class PaginaRegistroSteps {

    @Page
    PaginaRegistroPage paginaRegistroPage;
    @Step("Seleccionar icono de usuario")
    public void inconUser(){

        paginaRegistroPage.spanIconuser.click();
    }

    @Step("Seleccionar registro")
    public void seleccionarRegistro() {

        paginaRegistroPage.aregistro.click();
    }

    @Step("Seleccionar formulario")
    public void elegirFormulario() {

        paginaRegistroPage.buttonRegistro.waitUntilClickable().click();
    }

    @Step("Seleccionar nueva ventana")
    public void nuevaVentanas() {



        for (String windowHandle : paginaRegistroPage.getDriver().getWindowHandles()) {
            if(!paginaRegistroPage.getDriver().getWindowHandle().contentEquals(windowHandle)) {
                paginaRegistroPage.getDriver().switchTo().window(windowHandle);
                break;
            }
        }


    }

    @Step("completar el formulario de registro")
    public void llenarFormulario() {

        paginaRegistroPage.inputCorreo.sendKeys(Data.extractTo().get(0).get("Correo"));
        paginaRegistroPage.idNombre.sendKeys(Data.extractTo().get(0).get("Nombre"));
        paginaRegistroPage.idApellido.sendKeys(Data.extractTo().get(0).get("Apellido"));
        paginaRegistroPage.idanContra.sendKeys(Data.extractTo().get(0).get("IngresarContraseña"));
        paginaRegistroPage.idConfirContra.sendKeys(Data.extractTo().get(0).get("ConfirmarContraseña"));
    }
    @Step("seleccionar checkbots")
    public void seleccionarCheckbots() {

        JavascriptExecutor js = (JavascriptExecutor) paginaRegistroPage.getDriver();
        js.executeScript("arguments[0].click();", paginaRegistroPage.spanCHECKBOX1);

        paginaRegistroPage.labelAutoriza.click();
        paginaRegistroPage.inputRegistro.click();


    }




    @Step("Continuar con el registro")
    public void datosComplementarios(){

        paginaRegistroPage.inputCedula.sendKeys(Data.extractTo().get(0).get("Cedula"));

        Select select = new Select(paginaRegistroPage.seleGenero);
        select.selectByVisibleText(Data.extractTo().get(0).get("Genero"));

        paginaRegistroPage.inputFecha.sendKeys(Data.extractTo().get(0).get("Fecha"));




    }

    @Step("Seleccionar pais")
    public void SelecioneTelefono(){
        Select select= new Select(paginaRegistroPage.selectpais);
        select.selectByVisibleText(Data.extractTo().get(0).get("CodigoPais"));

        paginaRegistroPage.selecNumerocont.sendKeys(Data.extractTo().get(0).get("Telefono"));

    }

    @Step("Seleccionar Departamento")
    public void SelecioneDepartamento(){
        Select select= new Select(paginaRegistroPage.selectDepartamento);
        select.selectByVisibleText(Data.extractTo().get(0).get("Departamento"));
    }

    @Step("Seleccionar Ciudad")
    public void SelecioneCiudad(){
        Select select= new Select(paginaRegistroPage.selectCiudad);
        select.selectByVisibleText(Data.extractTo().get(0).get("Ciudad"));
    }

    @Step("Seleccionar Aceptar terminos y condiciones")
    public void seleccionarCheckbots2(){
        paginaRegistroPage.inputEnviar.click();
    }

}
