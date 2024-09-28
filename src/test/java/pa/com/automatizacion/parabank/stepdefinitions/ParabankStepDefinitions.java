package pa.com.automatizacion.parabank.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.automatizacion.parabank.tasks.Abrir;


public class ParabankStepDefinitions {
    @Before
    public void setState () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingresa a la pagina de parabank$")
    public void queElUsuarioIngresaALaPaginaDeParabank() {
        OnStage.theActorCalled("Usuario1").wasAbleTo(Abrir.lapagina());

    }

    @Cuando("^ingresa su usuario y clave$")
    public void ingresaSuUsuarioYClave() throws Exception {

    }

    @Entonces("^da click en LOGIN$")
    public void daClickEnLOGIN() throws Exception {

    }

    @Entonces("^al ingresar observa el mensaje Welcome Usuario$")
    public void alIngresarObservaElMensajeWelcomeUsuario() throws Exception {
    }
}
