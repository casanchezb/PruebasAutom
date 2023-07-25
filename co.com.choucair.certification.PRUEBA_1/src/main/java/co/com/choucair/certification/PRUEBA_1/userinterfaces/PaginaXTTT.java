package co.com.choucair.certification.PRUEBA_1.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PaginaXTTT {

    //public PaginaXTTT() {
//    }

    public static final Target TXT_USUARIO= Target.the("Ingresar usuario").located(By.xpath("//input[@placeholder='Username']"));
    public static final Target TXT_CONTRASENNA= Target.the("Ingresar clave").located(By.xpath("//input[@placeholder='Password']"));
    public static final Target BTN_SING_IN= Target.the("Boton ingresar").located(By.xpath("(//button[@type='submit'])[1]"));
    public static final Target LBL_MENU= Target.the("Texto inicio sesion").located(By.xpath("//h1[@id='bootstrap-admin-template']"));

}
