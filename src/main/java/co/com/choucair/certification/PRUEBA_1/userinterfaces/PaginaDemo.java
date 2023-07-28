package co.com.choucair.certification.PRUEBA_1.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDemo {

    public static final Target PRODUCTO_SAMSUNG= Target.the("Agregar Samsung").located(By.xpath("//a[text()='Samsung galaxy s6']"));
    public static final Target AGREGAR_CARRO= Target.the("Agregar al Carro").located(By.xpath("(//a[@href='#'])[7]"));
    public static final Target VER_CARRO= Target.the("Ver Carro").located(By.xpath("//a[@href='cart.html']"));
    public static final Target VER_CARROEL= Target.the("Ver Carro").located(By.xpath("//div[@id='page-wrapper']"));
    public static final Target VERF_CEL= Target.the("Texto Verificacion").located(By.xpath("//td[2]"));
    public static final Target ELIMINAR_CARRO= Target.the("Eliminar del Carro").located(By.xpath("(//a[@href='#'])[8]"));
    public static final Target BTREGISTRAR= Target.the("Boton sign up principal").located(By.xpath("(//a[@class='nav-link'])[8]"));
    public static final Target USUARIO= Target.the("Ingresar usuario").located(By.xpath("//input[@id='sign-username']"));
    public static final Target CONTRASENNA= Target.the("Ingresar clave").located(By.xpath("//input[@id='sign-password']"));
    public static final Target BTN_SING_IN= Target.the("Boton ingresar").located(By.xpath("(//button[@type='button'])[6]"));

}