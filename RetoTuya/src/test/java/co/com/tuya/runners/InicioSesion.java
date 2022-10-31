package co.com.tuya.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\iniciosesion.feature",
glue = "co.com.tuya.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE )
public class InicioSesion {
}
