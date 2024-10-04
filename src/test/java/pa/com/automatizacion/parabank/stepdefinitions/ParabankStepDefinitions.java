package pa.com.automatizacion.parabank.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.automatizacion.parabank.tasks.Abrir;
import pa.com.automatizacion.parabank.tasks.IniciarSesion;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ParabankStepDefinitions {
    @Before
    public void setState () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingresa a la pagina de parabank$")
    public void queElUsuarioIngresaALaPaginaDeParabank() {
        OnStage.theActorCalled("Usuario1").wasAbleTo(Abrir.lapagina());

    }

    @Cuando("^ingresa su (.*) y (.*)$")
    public void ingresaSuUsuarioYClave(String usuario, String clave) {
        System.setProperty("user",usuario);
        System.setProperty("pwd",clave);
        theActorInTheSpotlight().wasAbleTo(IniciarSesion.con());

    }

    @Entonces("^da click en LOGIN$")
    public void daClickEnLOGIN() throws Exception {

    }

    @Entonces("^al ingresar observa el mensaje Welcome Usuario$")
    public void alIngresarObservaElMensajeWelcomeUsuario() throws Exception {
    }
}
