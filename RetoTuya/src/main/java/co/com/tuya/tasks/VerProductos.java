package co.com.tuya.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tuya.userinterfaces.PaginaPrincipal.DESCRIPCION;
import static co.com.tuya.userinterfaces.PaginaPrincipal.LAPTOPS;

public class VerProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                InicioSesion.with(),
                WaitUntil.the(LAPTOPS, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                Click.on(LAPTOPS),
                Scroll.to(DESCRIPCION)
        );
    }
    public static VerProductos ver(){
        return Tasks.instrumented(VerProductos.class);
    }
}
