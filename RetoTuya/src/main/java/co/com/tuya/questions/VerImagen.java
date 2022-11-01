package co.com.tuya.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tuya.userinterfaces.PaginaPrincipal.LAPTOP_IMAGEN;

public class VerImagen implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LAPTOP_IMAGEN.resolveFor(actor).isVisible();
    }
    public static VerImagen verImagen(){
        return new VerImagen();
    }
}
