package pa.com.automatizacion.parabank.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm")
public class ParabankPage extends PageObject {

    public static final Target CAMPO_USER = Target.the("campo usuario del login").located(By.name("username"));
    public static final Target CAMPO_CLAVE = Target.the("campo clave del login").located(By.name("password"));
    public static final Target BOTON_INGRESAR = Target.the("boton ingresar").located(By.xpath("//input[@value='Log In']"));

}
