package pa.com.automatizacion.parabank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static pa.com.automatizacion.parabank.userinterface.ParabankPage.CAMPO_CLAVE;
import static pa.com.automatizacion.parabank.userinterface.ParabankPage.CAMPO_USER;


public class IniciarSesion implements Task {
    private String user;
    private String pwd;

    public IniciarSesion()  {
        this.user = System.getProperty("user");
        this.pwd = System.getProperty("pwd");
    }

    public static IniciarSesion con()  {
        return Tasks.instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(CAMPO_USER));
        actor.attemptsTo(Enter.theValue(pwd).into(CAMPO_CLAVE));

    }
}

