package co.com.choucair.certification.PRUEBA_1.interactions;

import co.com.choucair.certification.PRUEBA_1.utils.OwnWebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class AlertGetText implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        OwnWebDriver.nuevo().AlerGetText();
    }

    public static AlertGetText alert(){
        return Tasks.instrumented(AlertGetText.class);
    }
}