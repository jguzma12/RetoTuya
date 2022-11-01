package co.com.tuya.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public static final Target BTN_LOGIN = Target.the("Boton para loggearse")
            .located(By.id("login2"));

    public static final Target LAPTOPS = Target.the("Filtro laptos")
            .located(By.xpath("(//a[@id='itemc'])[2]"));
    public static final Target NAME_USER = Target.the("Name user ")
            .located(By.id("nameofuser"));

    public static final Target LAPTOP_IMAGEN = Target.the("Laptop imagen")
            .located(By.xpath("/html/body/div[5]/div/div[2]/div/div[3]/div/a/img"));

    public static final Target PRECIO_ = Target.the("Precio de la laptop")
            .located(By.xpath("(//*[(text()='$700')])[1]"));

    public static final Target DESCRIPCION = Target.the("Descripcion de la laptop")
            .located(By.xpath("(//*[@id='article'])[3]"));

    public static final Target LAPTOP = Target.the("Nombre de la laptop")
            .locatedBy("(//h4[@class='card-title'])[3]");
}
