package com.haceb.step;

import com.haceb.pageObject.PaginaInicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import static com.haceb.utils.Espera.espera;
import static com.haceb.utils.CerrarVentanasEmer.ventanaEmergente;

public class PaginaInicioSteps {

    @Page
    PaginaInicioPage paginaInicioPage;
    @Step("Abrir navegador")
    public void abrirNavegador(){
        paginaInicioPage.openUrl("https://www.haceb.com/");

    }
    @Step("cerrar ventana emergente")
    public void cerarVentana(){
            espera(paginaInicioPage.getDriver(), PaginaInicioPage.cerarVentana);
            ventanaEmergente(PaginaInicioPage.cerarVentana);
    }



}



