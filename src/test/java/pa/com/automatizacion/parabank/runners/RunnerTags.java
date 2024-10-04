package pa.com.automatizacion.parabank.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/automatizacionparabank.feature",
        tags = "@escenario2",
        glue = "pa.com.automatizacion.parabank.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}
