package co.com.tuya.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioSesion {
    public static final Target USERNAME = Target.the("Input del Usuario ")
            .located(By.id("loginusername"));
    public static final Target PASSWORD = Target.the("Input de contraseña")
            .located(By.id("loginpassword"));
    public static final Target BTN_LOGIN_USERNAME = Target.the("Boton para ingresar con credenciales")
            .locatedBy("(//button[@class='btn btn-primary'])[3]");
}
