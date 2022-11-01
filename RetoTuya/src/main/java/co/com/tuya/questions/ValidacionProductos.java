package co.com.tuya.questions;


import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.tuya.userinterfaces.PaginaPrincipal.*;

public class ValidacionProductos implements Question<Boolean> {
private String nombre;
private String precio;
private String descripcion;

    public ValidacionProductos(DataTable dataTable) {
        List<String> data = dataTable.raw().get(1);
        this.nombre = data.get(0);
        this.precio = data.get(1);
        this.descripcion = data.get(2);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LAPTOP.resolveFor(actor).getText().contains(nombre) &&
                PRECIO_.resolveFor(actor).getText().contains(precio)&&
                DESCRIPCION.resolveFor(actor).getText().contains(descripcion);
    }
    public static ValidacionProductos validacionProductos(DataTable dataTable){
        return new ValidacionProductos(dataTable);
    }
}
