package pa.com.automatizacion.parabank.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static pa.com.automatizacion.parabank.userinterface.ParabankPage.TEXTO_INGRESO_EXITOSO;


public class VerMensaje implements Question {
    private String mensaje;

    public VerMensaje(String mensaje)  {
        this.mensaje = mensaje;
    }
    public static VerMensaje ingresoExitoso(String mensaje) {
        return new VerMensaje(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String textoCapturado = Text.of(TEXTO_INGRESO_EXITOSO).viewedBy(actor).asString();

        if (mensaje.equals(textoCapturado)){
            resultado=true;
        }else {
            resultado=false;
        }
            return resultado;
    }
}
