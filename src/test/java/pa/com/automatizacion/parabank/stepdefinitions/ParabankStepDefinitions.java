package pa.com.automatizacion.parabank.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebElement;
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

    @Entonces("^al ingresar observa el mensaje (.*)$")
    public void alIngresarObservaElMensajeWelcomeUsuario(String mensaje) {
        theActorInTheSpotlight().should(seeThat);
    }

}