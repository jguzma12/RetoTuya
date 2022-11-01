package co.com.tuya.stepdefinitions;

import co.com.tuya.questions.InicioExitoso;
import co.com.tuya.questions.ValidacionProductos;
import co.com.tuya.questions.VerImagen;
import co.com.tuya.tasks.InicioSesion;
import co.com.tuya.tasks.VerProductos;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class InicioSesionStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Actor");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }

    @Dado("^Yo como usuario ingreso a la pagina$")
    public void yoComoUsuarioIngresoALaPagina() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));

    }

    @Cuando("^Yo quiero iniciar sesion$")
    public void yoQuieroIniciarSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(InicioSesion.with());
    }

    @Entonces("^Yo ingreso con exito$")
    public void yoIngresoConExito() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(InicioExitoso.exitoso(), Matchers.is(true)));
    }

    @Cuando("^El usuario inicia sesion correctamente se dirige a la seccion de laptops$")
    public void elUsuarioIniciaSesionCorrectamenteSeDirigeALaSeccionDeLaptops() {
        OnStage.theActorInTheSpotlight().attemptsTo(VerProductos.ver());

    }

    @Entonces("^El usuario puede ver nombre descripcion precio$")
    public void elUsuarioPuedeVerNombreDescripcionPrecio(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionProductos.validacionProductos(dataTable),
                Matchers.is(true)));
    }

    @Entonces("^El usuario puede ver la imagen$")
    public void elUsuarioPuedeVerLaImagen() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerImagen.verImagen(),
                Matchers.is(true)));
    }
}
