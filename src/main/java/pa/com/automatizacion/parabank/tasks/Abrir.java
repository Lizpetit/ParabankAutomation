package pa.com.automatizacion.parabank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.automatizacion.parabank.userinterface.ParabankPage;

public class Abrir implements Task {
    private ParabankPage parabankPage;
    public static Abrir lapagina() {
      return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(parabankPage));

    }
}
