package co.com.tuya.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\iniciosesion.feature",
        glue = "co.com.tuya.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Productos")
public class InicioSesion {
}
