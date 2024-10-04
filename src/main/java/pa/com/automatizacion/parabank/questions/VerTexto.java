package pa.com.automatizacion.parabank.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static pa.com.automatizacion.parabank.userinterface.ParabankPage.TEXTO_INGRESO_FALLIDO;

public class VerTexto implements Question {
    private String mensaje;

    public VerTexto(String mensaje)  {
        this.mensaje = mensaje;
    }
    public static VerTexto ingresoFallido(String mensaje) {
        return new VerTexto(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String textoCapturado = Text.of(TEXTO_INGRESO_FALLIDO).viewedBy(actor).asString();

        if (mensaje.equals(textoCapturado)){
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }
}


