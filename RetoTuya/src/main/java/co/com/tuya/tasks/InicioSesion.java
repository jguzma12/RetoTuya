package co.com.tuya.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tuya.userinterfaces.PaginaInicioSesion.*;
import static co.com.tuya.userinterfaces.PaginaPrincipal.BTN_LOGIN;
import static co.com.tuya.utils.Constantes.CONTRASENA;
import static co.com.tuya.utils.Constantes.USUARIO;

public class InicioSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN),
                Enter.theValue(USUARIO).into(USERNAME),
                Enter.theValue(CONTRASENA).into(PASSWORD),
                Click.on(BTN_LOGIN_USERNAME)
        );
    }

    public static InicioSesion with() {
        return Tasks.instrumented(InicioSesion.class);
    }
}
