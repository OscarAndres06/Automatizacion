package com.haceb.stepDefinition;

import com.haceb.step.PaginaInicioSteps;
import com.haceb.step.PaginaRegistroSteps;
import com.haceb.step.ValidacionSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegistroStepDefinition {

    @Steps
    PaginaInicioSteps paginaInicioSteps;
    @Steps
    PaginaRegistroSteps paginaRegistroSteps;
    @Steps
    ValidacionSteps validacionSteps;

    @Dado("que el usuario abre el navegador e ingrese al perfil y seleciona registro")
    public void queElUsuarioAbreElNavegadorEIngreseAlPerfilYSelecionaRegistro() {
        paginaInicioSteps.abrirNavegador();
        paginaInicioSteps.cerarVentana();
        
    }
    @Cuando("el usuario ingresa a la pagina de registro haceb e ingresa los datos requeridos para el registro")
    public void elUsuarioIngresaALaPaginaDeRegistroHacebEIngresaLosDatosRequeridosParaElRegistro() {
        paginaRegistroSteps.inconUser();
        paginaRegistroSteps.seleccionarRegistro();
        paginaRegistroSteps.elegirFormulario();
        paginaRegistroSteps.nuevaVentanas();

        paginaRegistroSteps.llenarFormulario();
        paginaRegistroSteps.seleccionarCheckbots();
        paginaRegistroSteps.datosComplementarios();
        paginaRegistroSteps.SelecioneTelefono();
        paginaRegistroSteps.SelecioneDepartamento();
        paginaRegistroSteps.SelecioneCiudad();
        paginaRegistroSteps.seleccionarCheckbots2();


    }
    @Entonces("el usuario podrá validar que se registro correctamente validando su perfil")
    public void elUsuarioPodráValidarQueSeRegistroCorrectamenteValidandoSuPerfil() {
        validacionSteps.validacionPerfil();
        
    }


}
