package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.DemoSerenityStep;

public class DemoSerenityDefinition {

    @Steps
    DemoSerenityStep demoSerenityStep;

    @Dado("^que el usuario ingresa a la pagina$")
    public void que_el_usuario_ingresa_a_la_pagina() {
        demoSerenityStep.abrirWeb();
    }

    @Cuando("^el usuario se loguea con su \"([^\"]*)\" y su \"([^\"]*)\"$")
    public void elUsuarioSeLogueaConSuYSu(String usuario, String contrasena){
        demoSerenityStep.loguearse(usuario.toString(), contrasena.toString());
    }
    @Entonces("se espera que el usuario sea redirigido a la pagina principal")
    public void seEsperaQueElUsuarioSeaRedirigidoALaPaginaPrincipal() {
        demoSerenityStep.validarInicioSesion();
    }

}
