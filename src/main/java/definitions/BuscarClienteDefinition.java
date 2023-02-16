package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.BuscarClienteStep;

public class BuscarClienteDefinition {
    @Steps
    BuscarClienteStep buscarClienteStep = new BuscarClienteStep();

    @Cuando("^el usuario introduce un \"([^\"]*)\" de cliente en la barra de busqueda$")
    public void el_usuario_introduce_un_de_cliente_en_la_barra_de_busqueda(String id) {
        buscarClienteStep.abrirNorthwindSection();
        buscarClienteStep.abrirCustomerSection();
        buscarClienteStep.BuscarCliente(id);
    }

    @Entonces("^se espera que se encuentre al cliente$")
    public void se_espera_que_se_encuentre_al_cliente() {
        buscarClienteStep.validarCliente();
    }

}
