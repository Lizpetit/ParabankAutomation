package pa.com.automatizacion.parabank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IniciarSesion implements Task {
    public static IniciarSesion con() {
        return Tasks.instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T t) {

    }
}
