package co.com.tuya.questions;

import co.com.tuya.tasks.InicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tuya.userinterfaces.PaginaPrincipal.NAME_USER;

public class InicioExitoso implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return NAME_USER.resolveFor(actor).getText().contains("Ingreso Exitoso.");
    }

    public static InicioExitoso exitoso() {
        return new InicioExitoso();
    }
}
